package com.example.learn_activity.data

import com.example.learn_activity.R
import com.example.learn_activity.model.Idol

object IdolData {
    private val nameIdol = arrayOf(
        "Elon Musk",
        "Steve Jobs",
        "Bill Gates",
        "Mark Zuckerberg",
        "Cristiano Ronaldo",
        "Jeff Bezos",
        "Sandiaga Uno",
        "Keanu Reeves",
        "Will Smith",
        "Andrew Garfield"
    )

    private val detailIdol = arrayOf(
        "Elon Reeve Musk FRS adalah tokoh bisnis, penemu, dan industrialis dari Amerika Serikat. Ia merupakan pendiri, CTO, dan CEO SpaceX, CEO dan arsitek produksi Tesla, pendiri The Boring Company, dan pendiri Neuralink.",
        "Steven Paul \"Steve\" Jobs adalah seorang tokoh bisnis dan penemu dari Amerika Serikat. Ia adalah pendiri pendamping, ketua, dan mantan CEO Apple Inc",
        "William Henry \"Bill\" Gates III adalah seorang tokoh bisnis, investor, filantropis, penulis asal Amerika Serikat, serta mantan CEO yang saat ini menjabat sebagai ketua Microsoft, perusahaan perangkat lunak yang ia dirikan bersama Paul Allen",
        "Mark Elliot Zuckerberg adalah seorang pemrogram komputer dan pengusaha Internet. Ia dikenal karena menciptakan situs jejaring sosial Facebook bersama temannya, yang dengan itu ia menjadi pejabat eksekutif dan presiden",
        "Cristiano Ronaldo dos Santos Aveiro GOIH ComM adalah seorang pemain sepak bola profesional asal Portugal yang bermain sebagai penyerang untuk klub Liga Utama Inggris, Manchester United dan juga kapten untuk tim nasional Portugal",
        "Jeffrey Preston Bezos adalah pengusaha terkaya di dunia sepanjang sejarah modern. Ia adalah pendiri, chairman, CEO, presiden dan pemilik saham mayoritas perusahaan teknologi terbesar di dunia Amazon.com. Kekayaan bersihnya US\$ 205 Miliar.",
        "Dr. H. Sandiaga Salahuddin Uno, B.B.A., M.B.A. adalah pengusaha dan politisi Indonesia. Ia dipercaya oleh Presiden Joko Widodo sebagai Menteri Pariwisata dan Ekonomi Kreatif dan Kepala Badan Pariwisata dan Ekonomi Kreatif pada Kabinet Indonesia Maju menggantikan Wishnutama yang dilantik pada tanggal 23 Desember 2020",
        "Keanu Charles Reeves adalah seorang pemeran film yang umumnya membintangi film-film Hollywood. Ia paling dikenal lewat perannya dalam trilogi The Matrix dan mempunyai kewarganegaraan Kanada. Reeves adalah seorang penganut agama Buddha dan penggemar olahraga hoki es.",
        "Willard Christopher Smith, Jr. (lahir 25 September 1968) adalah aktor Amerika Serikat peraih Academy Award dan Grammy Award untuk kategori artis hip hop dan komedian. Ia salah satu dari sekian banyak orang yang sukses di 3 media massa hiburan film, televisi, dan industri musik Amerika Serikat.",
        "Andrew Russell Garfield adalah seorang Pemeran, dari kewarganegaraan ganda di Amerika Serikat dan Britania Raya. Lahir di Los Angeles dan dibesarkan di Surrey, Garfield memulai kariernya di United Kingdom panggung dan televisi produksi. Dia membuat debut film pada tahun 2007 dengan judul Lions for Lambs."
    )

    private val photoIdol = arrayOf(
        R.drawable.elon_musk,
        R.drawable.steve_jobs,
        R.drawable.bill_gates,
        R.drawable.zuck,
        R.drawable.ronaldo,
        R.drawable.jeff,
        R.drawable.sandiaga_uno,
        R.drawable.keanu,
        R.drawable.will_smith,
        R.drawable.andrew_garfield
    )

    val listIdol: ArrayList<Idol>
        get() {
            val list = arrayListOf<Idol>()
            for (p in nameIdol.indices){
                var idol = Idol()
                idol.name = nameIdol[p]
                idol.detail = detailIdol[p]
                idol.photo = photoIdol[p]
                list.add(idol)
            }
            return list
        }


}