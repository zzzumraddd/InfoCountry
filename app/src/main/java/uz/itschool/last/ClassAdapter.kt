package uz.itschool.last

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ListAdapter
import uz.itschool.last.databinding.InLayoutBinding
import uz.itschool.last.databinding.OutLayoutBinding

class ClassAdapter(var continents:MutableMap<String, ArrayList<Country>>, var continents_name: ArrayList<String>):
    BaseExpandableListAdapter() {
    override fun getGroupCount(): Int {
        return continents_name.size
    }

    override fun getChildrenCount(p0: Int): Int {
        return continents.get(continents_name[p0])!!.size
    }

    override fun getGroup(p0: Int): String {
        return continents_name[p0]
    }

    override fun getChild(p0: Int, p1: Int): Country {
        return continents.get(continents_name[p0])!!.get((p1))
    }

    override fun getGroupId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getChildId(p0: Int, p1: Int): Long {
        return p1.toLong()
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(position: Int, p1: Boolean, convertView: View?,parent: ViewGroup?): View {
        var binding: OutLayoutBinding
        if(convertView == null){
            binding = OutLayoutBinding.inflate(LayoutInflater.from(parent!!.context),parent,false)
        }
        else {
            binding = OutLayoutBinding.bind(convertView)
        }
        binding.parent.text = continents_name.get(position).toString()
        return binding.root
    }

    override fun getChildView(parentPosition: Int, childPosition: Int, p2: Boolean, convertView: View?, parent: ViewGroup?): View {
        var binding: InLayoutBinding
        if(convertView == null){
            binding = InLayoutBinding.inflate(LayoutInflater.from(parent!!.context),parent,false)
        }
        else {
            binding = InLayoutBinding.bind(convertView)
        }


     //   binding.name_country_id.text = continents.get(continents_name[parentPosition])!!.get(childPosition)

        var c=continents.get(continents_name[parentPosition])!!.get((childPosition))

        binding.areaId.text=c.area
        binding.nameCountryId.text=c.name
        binding.capitalId.text=c.capital
        binding.imgId.setImageResource(c.img_id)


       //
        return binding.root


    }

    override fun isChildSelectable(p0: Int, p1: Int): Boolean {
        return false
    }

}