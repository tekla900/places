package com.example.places

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.place.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        val placeList = ArrayList<places>()


        placeList.add(places(1, "https://www.nomadicmatt.com/wp-content/uploads/2018/01/greece_guide.jpg"))
        placeList.add(places(2, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-machu-picchu-peru.jpg"))
        placeList.add(places(3, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/europe/Iceland/iceland_NationalGeographic_2168279.adapt.1900.1.jpg"))
        placeList.add(places(4, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/asia/georgia_h_00000220372879.adapt.1900.1.jpg"))
        placeList.add(places(5, "https://data.whicdn.com/images/317777837/original.jpg"))
        placeList.add(places(6, "https://i.pinimg.com/originals/a2/9e/18/a29e1811b7630780ea3f8f00e7ba1e8c.jpg"))
        placeList.add(places(7, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-rome-italy.jpg"))
        placeList.add(places(8, "https://hips.hearstapps.com/hbz.h-cdn.co/assets/16/16/gettyimages-116147513.jpg?crop=1.0xw:1xh;center,top&resize=480:*"))
        placeList.add(places(9, "https://s32388.pcdn.co/wp-content/uploads/2018/06/best-proposal-destinations-cinque-terre.jpg"))
        placeList.add(places(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb6a-Xkr_N2cCaPXvW0cFNHxqt4wPb-3QdPA&usqp=CAU"))
        placeList.add(places(1, "https://www.nomadicmatt.com/wp-content/uploads/2018/01/greece_guide.jpg"))
        placeList.add(places(2, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-machu-picchu-peru.jpg"))
        placeList.add(places(3, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/europe/Iceland/iceland_NationalGeographic_2168279.adapt.1900.1.jpg"))
        placeList.add(places(4, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/asia/georgia_h_00000220372879.adapt.1900.1.jpg"))
        placeList.add(places(5, "https://data.whicdn.com/images/317777837/original.jpg"))
        placeList.add(places(6, "https://i.pinimg.com/originals/a2/9e/18/a29e1811b7630780ea3f8f00e7ba1e8c.jpg"))
        placeList.add(places(7, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-rome-italy.jpg"))
        placeList.add(places(8, "https://hips.hearstapps.com/hbz.h-cdn.co/assets/16/16/gettyimages-116147513.jpg?crop=1.0xw:1xh;center,top&resize=480:*"))
        placeList.add(places(9, "https://s32388.pcdn.co/wp-content/uploads/2018/06/best-proposal-destinations-cinque-terre.jpg"))
        placeList.add(places(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb6a-Xkr_N2cCaPXvW0cFNHxqt4wPb-3QdPA&usqp=CAU"))
        placeList.add(places(1, "https://www.nomadicmatt.com/wp-content/uploads/2018/01/greece_guide.jpg"))
        placeList.add(places(2, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-machu-picchu-peru.jpg"))
        placeList.add(places(3, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/europe/Iceland/iceland_NationalGeographic_2168279.adapt.1900.1.jpg"))
        placeList.add(places(4, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/asia/georgia_h_00000220372879.adapt.1900.1.jpg"))
        placeList.add(places(5, "https://data.whicdn.com/images/317777837/original.jpg"))
        placeList.add(places(6, "https://i.pinimg.com/originals/a2/9e/18/a29e1811b7630780ea3f8f00e7ba1e8c.jpg"))
        placeList.add(places(7, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-rome-italy.jpg"))
        placeList.add(places(8, "https://hips.hearstapps.com/hbz.h-cdn.co/assets/16/16/gettyimages-116147513.jpg?crop=1.0xw:1xh;center,top&resize=480:*"))
        placeList.add(places(9, "https://s32388.pcdn.co/wp-content/uploads/2018/06/best-proposal-destinations-cinque-terre.jpg"))
        placeList.add(places(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb6a-Xkr_N2cCaPXvW0cFNHxqt4wPb-3QdPA&usqp=CAU"))
        placeList.add(places(1, "https://www.nomadicmatt.com/wp-content/uploads/2018/01/greece_guide.jpg"))
        placeList.add(places(2, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-machu-picchu-peru.jpg"))
        placeList.add(places(3, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/europe/Iceland/iceland_NationalGeographic_2168279.adapt.1900.1.jpg"))
        placeList.add(places(4, "https://www.nationalgeographic.com/content/dam/travel/Guide-Pages/asia/georgia_h_00000220372879.adapt.1900.1.jpg"))
        placeList.add(places(5, "https://data.whicdn.com/images/317777837/original.jpg"))
        placeList.add(places(6, "https://i.pinimg.com/originals/a2/9e/18/a29e1811b7630780ea3f8f00e7ba1e8c.jpg"))
        placeList.add(places(7, "https://www.planetware.com/wpimages/2019/09/top-places-to-visit-in-the-world-rome-italy.jpg"))
        placeList.add(places(8, "https://hips.hearstapps.com/hbz.h-cdn.co/assets/16/16/gettyimages-116147513.jpg?crop=1.0xw:1xh;center,top&resize=480:*"))
        placeList.add(places(9, "https://s32388.pcdn.co/wp-content/uploads/2018/06/best-proposal-destinations-cinque-terre.jpg"))
        placeList.add(places(10, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQb6a-Xkr_N2cCaPXvW0cFNHxqt4wPb-3QdPA&usqp=CAU"))





        val placesAdapter = PlacesAdapter(placeList)


        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = placesAdapter

    }
}