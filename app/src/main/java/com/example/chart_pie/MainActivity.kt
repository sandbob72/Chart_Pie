package com.example.chart_pie

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.graphics.Color.rgb
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.components.Description
import com.github.mikephil.charting.components.Legend
import com.github.mikephil.charting.components.LimitLine
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import com.github.mikephil.charting.formatter.PercentFormatter
import com.github.mikephil.charting.utils.ColorTemplate
import com.example.chart_pie.databinding.ActivityMainBinding
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    var mPie1: PieChart? = null
    var mPie2: PieChart? = null
    var mPie3: PieChart? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val data1 = 50
        val data2 = 10
        val data3 = 75

        binding.text1.text = "สำเร็จ"
        binding.text2.text = "ไม่สำเร็จ"
        binding.text3.text = "ยังทำไม่ได้"

        mPie1 = findViewById(R.id.pie)
        mPie2 = findViewById(R.id.pie2)
        mPie3 = findViewById(R.id.pie3)

        val DarkGreen = rgb(0,100,0)
        val Red = rgb(255,0,0)
        val DarkYellow = rgb(204,204,0)

        setupPieChartViewOne(data1,mPie1,DarkGreen)
        setupPieChartViewOne(data2,mPie2,Red)
        setupPieChartViewOne(data3,mPie3,DarkYellow)

    }
    //------------------------------------------------------------------------------------------------//
    //------------------------------------------------------------------------------------------------//
    fun setupPieChartViewOne(data : Int, mPie: PieChart?,color: Int ) {
        mPie?.setUsePercentValues(true)
        mPie?.setHoleRadius(75f)
        mPie?.dragDecelerationFrictionCoef
        mPie?.setTransparentCircleRadius(0f)
        mPie?.animateX(1000)


        val value = Arrays.asList(10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f)
        val entry = ArrayList<PieEntry>()
        for(i in value.indices) {
            entry.add( PieEntry(value.get(i)))
        }

        val colors = ArrayList<Int>()
        colors.addAll(valueData(data,color))

        val dataSet = PieDataSet(entry, "")
        dataSet.setColors(colors)
        dataSet.setDrawValues(true)
        dataSet.setSliceSpace(2f)

        val pieData = PieData(dataSet)
        pieData.setValueFormatter(PercentFormatter())
        pieData.setValueTextSize(0f)
        pieData.setValueTextColor(Color.WHITE)

        mPie?.setCenterText("$data%")
        mPie?.setCenterTextSize(20f)
        mPie?.data = pieData
        mPie?.legend!!.isEnabled = false
        mPie?.description!!.isEnabled = false
        mPie?.setTouchEnabled(false)

    }

    //------------------------------------------------------------------------------------------------//
    //------------------------------------------------------------------------------------------------//

    //data set color

    fun valueData(data:Int,color: Int):ArrayList<Int>
    {
        val colors = ArrayList<Int>()
        var colorSelect = data/10
        var colorWhite = 10 - colorSelect
        for (i in 1..colorSelect) colors.add(color)
        for (i in 1..colorWhite) colors.add(Color.GRAY)
        return colors
    }
    //--------------------------------------------------------------------------------------------------//

}

