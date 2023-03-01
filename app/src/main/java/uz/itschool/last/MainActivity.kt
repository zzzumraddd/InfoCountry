package uz.itschool.last

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.itschool.last.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var continents:MutableMap<String, ArrayList<Country>>
    private lateinit var continents_name:ArrayList<String>
    private lateinit var binding: ActivityMainBinding
    private lateinit var countryArrayLIst:ArrayList<Country>
    private lateinit var name_list:Array<String>
    private lateinit var capital_name_list:Array<String>
    private lateinit var area: Array<String>
    private lateinit var info_of_countries_list: Array<String>
    private lateinit var imageId_list: IntArray
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadDate()

        imageId_list= intArrayOf(
            R.drawable.image_1,
            R.drawable.uzb,
            R.drawable.img_10,
            R.drawable.img_2,
            R.drawable.img_3,
            R.drawable.img_4,
            R.drawable.img_5,
            R.drawable.img_6,
            R.drawable.img_7,
            R.drawable.img_8,
            R.drawable.img_9,
        )

        name_list = arrayOf(
            "Pakistan",
            "Uzbekistan",
            "Kuwait",
            "Iran",
            "Syria",
            "Qatar",
            "Armenia",
            "Israil",
            "Malaysia",
            "Thailand",
            "Afghanistan"
        )

        capital_name_list=arrayOf(
            "Islamabad",
            "Tashkent",
            "Kuwait City",
            "Tehran",
            "Damascus",
            "Doha",
            "Yerevan",
            "Jerusalem",
            "Kuala Lumpur",
            "Bangkok",
            "Kabul",
        )
        area=arrayOf(
            "881,913 km²",
            "447,400 km²",
            "17,818 km²",
            "1.648 million km²",
            "185,180 km²",
            "11,571 km²",
            "29,743 km²",
            "22,145 km²",
            "329,847 km²",
            "513,120 km²",
            "652,860 km²",
        )
        info_of_countries_list=arrayOf(
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
        )
       /* var adapter=ClassAdapter(continents, continents_name)
        binding.expandListVIew.setAdapter(adapter)*/
        /*countryArrayLIst=ArrayList<Country>()
        for(i in name_list.indices){
            val country_obj=Country(name_list[i],capital_name_list[i],area[i],info_of_countries_list[i],imageId_list[i])
            countryArrayLIst.add(country_obj)
        }*/
        /*binding.expandListVIew.isClickable=true*/
        binding.expandListVIew.setAdapter(ClassAdapter(continents,continents_name))

        /*binding.expandListVIew.setOnChildClickListener { parent, v, groupPosition, childPosition, id ->
            val name_c=name_list[childPosition]
            val capital_c=capital_name_list[childPosition]
            val area_c=area[childPosition]
            val img_c=imageId_list[childPosition]
            val info_c=info_of_countries_list[childPosition]

            val intent= Intent(this@MainActivity, UserActivity::class.java)
            intent.putExtra("name_c",name_c)
            intent.putExtra("capital_c",capital_c)
            intent.putExtra("area_c",area_c)
            intent.putExtra("img_c",img_c)
            intent.putExtra("info_c",info_c)
            startActivity(intent)

        }*/
        binding.expandListVIew.setOnChildClickListener { expandableListView, view, i, i2, l ->

            val name_c=name_list[i]
            val capital_c=capital_name_list[i]
            val area_c=area[i]
            val img_c=imageId_list[i]
            val info_c=info_of_countries_list[i]

            val intent= Intent(this@MainActivity, UserActivity::class.java)
            intent.putExtra("name_c",name_c)
            intent.putExtra("capital_c",capital_c)
            intent.putExtra("area_c",area_c)
            intent.putExtra("img_c",img_c)
            intent.putExtra("info_c",info_c)
            startActivity(intent)
            false
        }
        binding.expandListVIew.setOnGroupClickListener { expandableListView, view, i, l ->


            false
        }

        binding.expandListVIew.setOnGroupExpandListener {

        }
        binding.expandListVIew.setOnGroupCollapseListener {

        }
       /* binding.expandListVIew.setOnItemClickListener { parent, view, position, id ->
            val name_c=name_list[position]
            val capital_c=capital_name_list[position]
            val area_c=area[position]
            val img_c=imageId_list[position]
            val info_c=info_of_countries_list[position]

            val intent= Intent(this, UserActivity::class.java)
            intent.putExtra("name_c",name_c)
            intent.putExtra("capital_c",capital_c)
            intent.putExtra("area_c",area_c)
            intent.putExtra("img_c",img_c)
            intent.putExtra("info_c",info_c)
            startActivity(intent)
        }*/
    }



    private fun loadDate(){
        continents= mutableMapOf()
        var country_obj= arrayListOf<Country>()
        country_obj.add(Country("Pakistan","Islamabad","881,913 km²",
            "Pakistan (Urdu: پاکِستان [ˈpaːkɪstaːn]),[d] officially the Islamic Republic of Pakistan (اِسلامی جمہوریہ پاکِستان), is a country in South Asia. It is the world's fifth-most populous country, with a population of almost 243 million people, and has the world's second-largest Muslim population just behind Indonesia.[15] Pakistan is the 33rd-largest country in the world by area and the second-largest in South Asia, spanning 881,913 square kilometres (340,509 square miles). It has a 1,046-kilometre (650-mile) coastline along the Arabian Sea and Gulf of Oman in the south, and is bordered by India to the east, Afghanistan to the west, Iran to the southwest, and China to the northeast. It is separated narrowly from Tajikistan by Afghanistan's Wakhan Corridor in the north, and also shares a maritime border with Oman. Islamabad is the nation's capital, while Karachi is its largest city and financial centre.",
            R.drawable.image_1))
        country_obj.add(Country("Uzbekistan","Tashkent","447,400 km²",
"Uzbekistan (UK: /ʊzˌbɛkɪˈstɑːn, ʌz-, -ˈstæn/, US: /ʊzˈbɛkɪstæn, -stɑːn/;[15][16] Uzbek: Oʻzbekiston / Ўзбекистон, pronounced [ozbekiˈstɒn]; Russian: Узбекистан), officially the Republic of Uzbekistan (Uzbek: Oʻzbekiston Respublikasi / Ўзбекистон Республикаси), is a doubly landlocked country located in Central Asia. It is surrounded by five landlocked countries: Kazakhstan to the north; Kyrgyzstan to the northeast; Tajikistan to the southeast; Afghanistan to the south; and Turkmenistan to the southwest. Its capital and largest city is Tashkent. Uzbekistan is part of the Turkic world, as well as a member of the Organization of Turkic States. The Uzbek language is the majority-spoken language in Uzbekistan, while Russian is widely spoken and understood throughout the country. Tajik is also spoken as a minority language, predominantly in Samarkand and Bukhara. Islam is the predominant religion in Uzbekistan, most Uzbeks being Sunni Muslims.[17]",
            R.drawable.uzb))
        country_obj.add(Country("Kuwait","Kuwait City","17,818 km²",
"Kuwait, country of the Arabian Peninsula located in the northwestern corner of the Persian Gulf. A small emirate nestled between Iraq and Saudi Arabia, Kuwait is situated in a section of one of the driest, least-hospitable deserts on Earth. Its shore, however, includes Kuwait Bay, a deep harbour on the Persian Gulf. There, in the 18th century, Bedouin from the interior founded a trading post. The name Kuwait is derived from the Arabic diminutive of the Hindustani kūt (“fort”). Since the emirate’s ruling family, the Āl Ṣabāḥ, formally established a sheikhdom in 1756, the country’s fortunes have been linked to foreign commerce. In time and with accumulated wealth, the small fort grew to become Kuwait city, a modern metropolis mingling skyscrapers, apartment buildings, and mosques. Kuwait city has most of the country’s population, which makes Kuwait one of the world’s most-urbanized countries.",
            R.drawable.img_10))
        country_obj.add(Country("Iran","Tehran","1.648 million km²",
"Iran, a mountainous, arid, and ethnically diverse country of southwestern Asia. The country maintains a rich and distinctive cultural and social continuity dating back to the Achaemenian period, which began in 550 BCE. In recent decades it has become known for its unique brand of Islamic republic. Although the system of government was intended as a parliamentary democracy, persistent instability both at home and abroad have steered its slide into a more theocratic authoritarianism. In 2022 the state’s push to pacify economic unrest through repression prompted widespread and debilitating protests, which were catalyzed in part by the death of Jina Mahsa Amini while she was in custody for improper attire.",
            R.drawable.img_2))
        country_obj.add(Country("Syria","Damascus","185,180 km²",
"Syria, country located on the east coast of the Mediterranean Sea in southwestern Asia. Its area includes territory in the Golan Heights that has been occupied by Israel since 1967. The present area does not coincide with ancient Syria, which was the strip of fertile land lying between the eastern Mediterranean coast and the desert of northern Arabia. The capital is Damascus (Dimashq), on the Baradā River, situated in an oasis at the foot of Mount Qāsiyūn. After Syria gained its independence in 1946, political life in the country was highly unstable, owing in large measure to intense friction between the country’s social, religious, and political groups. In 1970 Syria came under the authoritarian rule of Pres. Hafez al-Assad, whose foremost goals included achieving national security and domestic stability and recovering the Syrian territory lost to Israel in 1967.",            R.drawable.img_3))
        country_obj.add(Country("Qatar","Doha","11,571 km²",
"Occupying a small desert peninsula that extends northward from the larger Arabian Peninsula, it has been continuously but sparsely inhabited since prehistoric times. Following the rise of Islam, the region became subject to the Islamic caliphate; it later was ruled by a number of local and foreign dynasties before falling under the control of the Thani dynasty (Āl Thānī) in the 19th century. The Thani dynasty sought British patronage against competing tribal groups and against the Ottoman Empire—which occupied the country in the late 19th and early 20th centuries—and in exchange the United Kingdom controlled Qatar’s foreign policy until the latter’s independence in 1971. Thereafter the monarchy continued to nurture close ties with Western powers as a central pillar of its national security. Qatar has one of the world’s largest reserves of petroleum and natural gas and employs large numbers of foreign workers in its production process. Because of its oil wealth, the country’s residents enjoy a high standard of living and a well-established system of social services.",
            R.drawable.img_4))
        country_obj.add(Country("Armenia","Yerevan","29,743 km²",
"Armenia, country of Transcaucasia, lying just south of the great mountain range of the Caucasus and fronting the northwestern extremity of Asia. To the north and east Armenia is bounded by Georgia and Azerbaijan, while its neighbours to the southeast and west are, respectively, Iran and Turkey. Naxçıvan, an exclave of Azerbaijan, borders Armenia to the southwest. The capital is Yerevan (Erevan). Modern Armenia comprises only a small portion of ancient Armenia, one of the world’s oldest centres of civilization. At its height, Armenia extended from the south-central Black Sea coast to the Caspian Sea and from the Mediterranean Sea to Lake Urmia in present-day Iran. Ancient Armenia was subjected to constant foreign incursions, finally losing its autonomy in the 14th century CE. The centuries-long rule of Ottoman and Persian conquerors imperiled the very existence of the Armenian people. Eastern Armenia was annexed by Russia during the 19th century, while western Armenia remained under Ottoman rule, and in 1894–96 and 1915 the Ottoman government perpetrated systematic massacres and forced deportations of Armenians.",            R.drawable.img_5))
        country_obj.add(Country("Israel","Jerusalem","22,145 km²",
"Israel (/ˈɪzri.əl, -reɪ-/; Hebrew: יִשְׂרָאֵל Yīsrāʾēl [jisʁaˈʔel]; Arabic: إِسْرَائِيل ʾIsrāʾīl), officially the State of Israel (מְדִינַת יִשְׂרָאֵל Medīnat Yīsrāʾēl [mediˈnat jisʁaˈʔel]; دَوْلَة إِسْرَائِيل Dawlat Isrāʾīl), is a country in Western Asia. Situated in the Southern Levant, it is bordered by Lebanon to the north, by Syria to the northeast, by Jordan to the east, by the Red Sea to the south, by Egypt to the southwest, by the Mediterranean Sea to the west, and by the Palestinian territories — the West Bank along the east and the Gaza Strip along the southwest. Tel Aviv is the economic and technological center of the country, while its seat of government is in its proclaimed capital of Jerusalem, although Israeli sovereignty over East Jerusalem is unrecognized internationally. Israel is located in the region historically known as the Land of Israel, Palestine, Canaan or the Holy Land, which is regarded as the birthplace of the Jewish people and significant to the Abrahamic religions.",            R.drawable.img_6))
        country_obj.add(Country("Malaysia","Kuala Lumpur","329,847 km²",
"Malaysia, country of Southeast Asia, lying just north of the Equator, that is composed of two noncontiguous regions: Peninsular Malaysia (Semenanjung Malaysia), also called West Malaysia (Malaysia Barat), which is on the Malay Peninsula, and East Malaysia (Malaysia Timur), which is on the island of Borneo. The Malaysian capital, Kuala Lumpur, lies in the western part of the peninsula, about 25 miles (40 km) from the coast; the administrative centre, Putrajaya, is located about 16 miles (25 km) south of the capital. Malaysia, a member of the Commonwealth, represents the political marriage of territories that were formerly under British rule. In August 1965 Singapore seceded from the federation and became an independent republic." ,            R.drawable.img_7))
        country_obj.add(Country("Thailand","Bangkok","513,120 km²",
            "Thailand, country located in the centre of mainland Southeast Asia. Located wholly within the tropics, Thailand encompasses diverse ecosystems, including the hilly forested areas of the northern frontier, the fertile rice fields of the central plains, the broad plateau of the northeast, and the rugged coasts along the narrow southern peninsula. Until the second half of the 20th century, Thailand was primarily an agricultural country, but since the 1960s increasing numbers of people have moved to Bangkok, the capital, and to other cities. Political authority, however, has often been held by the military, which has taken power through coups. During the last two decades of the 20th century and the first decade of the 21st, parliamentary democracy steadily gained wider popular support.",
            R.drawable.img_8))
        country_obj.add(Country("Afghanistan","Kabul","652,860 km²",
"Afghanistan, landlocked multiethnic country located in the heart of south-central Asia. Lying along important trade routes connecting southern and eastern Asia to Europe and the Middle East, Afghanistan has long been a prize sought by empire builders, and for millennia great armies have attempted to subdue it, leaving traces of their efforts in great monuments now fallen to ruin. The country’s forbidding landscape of deserts and mountains has laid many imperial ambitions to rest, as has the tireless resistance of its fiercely independent peoples—so independent that the country has failed to coalesce into a nation but has instead long endured as a patchwork of contending ethnic factions and ever-shifting alliances. The modern boundaries of Afghanistan were established in the late 19th century in the context of a rivalry between imperial Britain and tsarist Russia that Rudyard Kipling termed the “Great Game.” ",
            R.drawable.img_9))


        var country_obj_europe= arrayListOf<Country>()
        country_obj_europe.add((Country("Belgium","Brussels","30,688 km²","Belgium,[A] officially the Kingdom of Belgium,[B] is a country in Northwestern Europe. The country is bordered by the Netherlands to the north, Germany to the east, Luxembourg to the southeast, France to the southwest, and the North Sea to the northwest. It covers an area of 30,528 km2 (11,787 sq mi) and has a population of more than 11.5 million,[11] making it the 22nd most densely populated country in the world and the 6th most densely populated country in Europe, with a density of 376/km2 (970/sq mi). Belgium is part of an area known as the Low Countries, historically a somewhat larger region than the Benelux group of states, as it also included parts of northern France. The capital and largest city is Brussels; other major cities are Antwerp, Ghent, Charleroi, Liège, Bruges, Namur, and Leuven. Belgium is a sovereign state and a federal constitutional monarchy with a parliamentary system. Its institutional organization is complex and is structured on both regional and linguistic grounds.",
        R.drawable.belgium)))
        country_obj_europe.add((Country("Ireland","Dublin","70,273 km²","Ireland (/ˈaɪərlənd/ (listen) YRE-lənd; Irish: Éire [ˈeːɾʲə] (listen); Ulster-Scots: Airlann [ˈɑːrlən]) is an island in the North Atlantic Ocean, in north-western Europe. It is separated from Great Britain to its east by the North Channel, the Irish Sea, and St George's Channel. Ireland is the second-largest island of the British Isles, the third-largest in Europe, and the twentieth-largest in the world. Geopolitically, Ireland is divided between the Republic of Ireland (officially named Ireland), an independent state covering five-sixths of the island, and Northern Ireland, which is part of the United Kingdom. As of 2022, the population of the entire island is just over 7 million, with 5.1 million living in the Republic of Ireland and 1.9 million in Northern Ireland, ranking it the second-most populous island in Europe after Great Britain.",
        R.drawable.ireland)))
        country_obj_europe.add((Country("Romania","Bucharest","238,397 km²","Romania (/roʊˈmeɪniə/ (listen) roh-MAY-nee-ə; Romanian: România [romɨˈni.a] (listen)) is a country located at the crossroads of Central, Eastern, and Southeastern Europe. It borders Bulgaria to the south, Ukraine to the north, Hungary to the west, Serbia to the southwest, Moldova to the east, and the Black Sea to the southeast. It has a predominantly temperate-continental climate, and an area of 238,397 km2 (92,046 sq mi), with a population of around 19 million.[3] Romania is the twelfth-largest country in Europe and the sixth-most populous member state of the European Union. Its capital and largest city is Bucharest, followed by Iași, Cluj-Napoca, Timișoara, Constanța, Craiova, Brașov, and Galați. It is member of the European Union (EU), NATO, European Council (EUCO), BSEC, and WTO.  Europe's second-longest river, the Danube, rises in Germany's Black Forest and flows southeasterly for 2,857 km (1,775 mi), before emptying into Romania's Danube Delta. The Carpathian Mountains cross Romania from the north to the southwest and include Moldoveanu Peak, at an altitude of 2,544 m (8,346 ft).",
        R.drawable.romania)))




        continents.put("Asia", country_obj)
        continents.put("Europe", country_obj_europe)
        continents.put("Antarctica", country_obj)
        continents.put("North America", country_obj)
        continents.put("South America", country_obj_europe)
        continents.put("Australia", country_obj)
        continents.put("Africa", country_obj)
        continents_name= ArrayList(continents.keys)
    }
}