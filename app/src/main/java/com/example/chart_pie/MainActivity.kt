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

    var mPie: PieChart? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val data1 = 25
        val data2 = 50
        val data3 = 75

        binding.text1.text = "$data1"
        binding.text2.text = "$data2"
        binding.text3.text = "$data3"

        setupPieChartViewOne(data1)
        setupPieChartViewTwo(data2)
        setupPieChartViewThree(data3)

    }
    //------------------------------------------------------------------------------------------------//
    //------------------------------------------------------------------------------------------------//
    fun setupPieChartViewOne(data : Int) {
        mPie = findViewById(R.id.pie)
        mPie?.setUsePercentValues(true)
        //mPie?.setExtraOffsets(10f, 10f, 10f, 10f)
        mPie?.setHoleRadius(80f)
        mPie?.dragDecelerationFrictionCoef
        mPie?.setTransparentCircleRadius(0f)
        mPie?.animateX(1000)


        val value = Arrays.asList(10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f)
        val entry = ArrayList<PieEntry>()
        for(i in value.indices) {
            entry.add( PieEntry(value.get(i)))
        }

        val colors = ArrayList<Int>()

        if (data == 0){
            for (i in 1..10)
            colors.add(Color.LTGRAY)
        }
        else if (data > 0 && data <= 10){
            colors.add(Color.RED)
            for (i in 1..9)
                colors.add(Color.LTGRAY)
        }
        else if (data > 10 && data <= 20){
            for (i in 1..2)
                colors.add(Color.RED)
            for (i in 1..8)
                colors.add(Color.LTGRAY)
        }
        else if (data > 20 && data <= 30){
            for (i in 1..3)
                colors.add(Color.RED)
            for (i in 1..7)
                colors.add(Color.LTGRAY)
        }
        else if (data > 30 && data <= 40){
            for (i in 1..4)
                colors.add(Color.RED)
            for (i in 1..6)
                colors.add(Color.LTGRAY)
        }
        else if (data > 40 && data <= 50){
            for (i in 1..5)
                colors.add(Color.RED)
            for (i in 1..5)
                colors.add(Color.LTGRAY)
        }
        else if (data > 50 && data <= 60){
            for (i in 1..6)
                colors.add(Color.RED)
            for (i in 1..4)
                colors.add(Color.LTGRAY)
        }
        else if (data > 60 && data <= 70){
            for (i in 1..7)
                colors.add(Color.RED)
            for (i in 1..3)
                colors.add(Color.LTGRAY)
        }
        else if (data > 70 && data <= 80){
            for (i in 1..8)
                colors.add(Color.RED)
            for (i in 1..2)
                colors.add(Color.LTGRAY)
        }
        else if (data > 80 && data < 100){
            for (i in 1..9)
                colors.add(Color.RED)

            colors.add(Color.LTGRAY)
        }
        else if (data == 100){
            for (i in 1..10)
                colors.add(Color.RED)

        }

        val dataSet = PieDataSet(entry, "")
        dataSet.setColors(colors)
        dataSet.setDrawValues(true)
        dataSet.setSliceSpace(5f)

        val pieData = PieData(dataSet)
        pieData.setValueFormatter(PercentFormatter())
        pieData.setValueTextSize(0f)
        pieData.setValueTextColor(Color.WHITE)

        mPie?.data = pieData
        mPie?.legend!!.isEnabled = false
        mPie?.description!!.isEnabled = false
        mPie?.setTouchEnabled(false)

    }

    //------------------------------------------------------------------------------------------------//
    //------------------------------------------------------------------------------------------------//
    fun setupPieChartViewTwo(data: Int) {
        mPie = findViewById(R.id.pie2)

        mPie?.setUsePercentValues(true)
        //mPie?.setExtraOffsets(50f, 50f, 50f, 50f)
        mPie?.setHoleRadius(80f)

        mPie?.dragDecelerationFrictionCoef
        mPie?.setTransparentCircleRadius(0f)
        mPie?.animateX(1000)


        val value = Arrays.asList(10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f)
        val entry = ArrayList<PieEntry>()
        for(i in value.indices) {
            entry.add( PieEntry(value.get(i)))
        }

        val colors = ArrayList<Int>()

        if (data == 0){
            for (i in 1..10)
                colors.add(Color.LTGRAY)
        }
        else if (data > 0 && data <= 10){
            colors.add(Color.GREEN)
            for (i in 1..9)
                colors.add(Color.LTGRAY)
        }
        else if (data > 10 && data <= 20){
            for (i in 1..2)
                colors.add(Color.GREEN)
            for (i in 1..8)
                colors.add(Color.LTGRAY)
        }
        else if (data > 20 && data <= 30){
            for (i in 1..3)
                colors.add(Color.GREEN)
            for (i in 1..7)
                colors.add(Color.LTGRAY)
        }
        else if (data > 30 && data <= 40){
            for (i in 1..4)
                colors.add(Color.GREEN)
            for (i in 1..6)
                colors.add(Color.LTGRAY)
        }
        else if (data > 40 && data <= 50){
            for (i in 1..5)
                colors.add(Color.GREEN)
            for (i in 1..5)
                colors.add(Color.LTGRAY)
        }
        else if (data > 50 && data <= 60){
            for (i in 1..6)
                colors.add(Color.GREEN)
            for (i in 1..4)
                colors.add(Color.LTGRAY)
        }
        else if (data > 60 && data <= 70){
            for (i in 1..7)
                colors.add(Color.GREEN)
            for (i in 1..3)
                colors.add(Color.LTGRAY)
        }
        else if (data > 70 && data <= 80){
            for (i in 1..8)
                colors.add(Color.GREEN)
            for (i in 1..2)
                colors.add(Color.LTGRAY)
        }
        else if (data > 80 && data < 100){
            for (i in 1..9)
                colors.add(Color.GREEN)

            colors.add(Color.LTGRAY)
        }
        else if (data == 100){
            for (i in 1..10)
                colors.add(Color.RED)

        }

        val dataSet = PieDataSet(entry, "")
        dataSet.setColors(colors)
        dataSet.setDrawValues(true)
        dataSet.setSliceSpace(5f)

        val pieData = PieData(dataSet)
        pieData.setValueFormatter(PercentFormatter())
        pieData.setValueTextSize(0f)
        pieData.setValueTextColor(Color.WHITE)

        mPie?.data = pieData
        mPie?.legend!!.isEnabled = false
        mPie?.description!!.isEnabled = false
        mPie?.setTouchEnabled(false)

    }


    //------------------------------------------------------------------------------------------------//
    //------------------------------------------------------------------------------------------------//
    fun setupPieChartViewThree(data: Int) {
        mPie = findViewById(R.id.pie3)

        mPie?.setUsePercentValues(true)
        //mPie?.setExtraOffsets(50f, 50f, 50f, 50f)
        mPie?.setHoleRadius(80f)

        mPie?.dragDecelerationFrictionCoef
        mPie?.setTransparentCircleRadius(0f)
        mPie?.animateX(1000)


        val value = Arrays.asList(10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f, 10f)
        val entry = ArrayList<PieEntry>()
        for(i in value.indices) {
            entry.add( PieEntry(value.get(i)))
        }

        val colors = ArrayList<Int>()

        if (data == 0){
            for (i in 1..10)
                colors.add(Color.LTGRAY)
        }
        else if (data > 0 && data <= 10){
            colors.add(Color.BLUE)
            for (i in 1..9)
                colors.add(Color.LTGRAY)
        }
        else if (data > 10 && data <= 20){
            for (i in 1..2)
                colors.add(Color.BLUE)
            for (i in 1..8)
                colors.add(Color.LTGRAY)
        }
        else if (data > 20 && data <= 30){
            for (i in 1..3)
                colors.add(Color.BLUE)
            for (i in 1..7)
                colors.add(Color.LTGRAY)
        }
        else if (data > 30 && data <= 40){
            for (i in 1..4)
                colors.add(Color.BLUE)
            for (i in 1..6)
                colors.add(Color.LTGRAY)
        }
        else if (data > 40 && data <= 50){
            for (i in 1..5)
                colors.add(Color.BLUE)
            for (i in 1..5)
                colors.add(Color.LTGRAY)
        }
        else if (data > 50 && data <= 60){
            for (i in 1..6)
                colors.add(Color.BLUE)
            for (i in 1..4)
                colors.add(Color.LTGRAY)
        }
        else if (data > 60 && data <= 70){
            for (i in 1..7)
                colors.add(Color.BLUE)
            for (i in 1..3)
                colors.add(Color.LTGRAY)
        }
        else if (data > 70 && data <= 80){
            for (i in 1..8)
                colors.add(Color.BLUE)
            for (i in 1..2)
                colors.add(Color.LTGRAY)
        }
        else if (data > 80 && data < 100){
            for (i in 1..9)
                colors.add(Color.BLUE)

            colors.add(Color.LTGRAY)
        }
        else if (data == 100){
            for (i in 1..10)
                colors.add(Color.BLUE)

        }

        val dataSet = PieDataSet(entry, "")
        dataSet.setColors(colors)
        dataSet.setDrawValues(true)
        dataSet.setSliceSpace(5f)

        val pieData = PieData(dataSet)
        pieData.setValueFormatter(PercentFormatter())
        pieData.setValueTextSize(0f)
        pieData.setValueTextColor(Color.WHITE)

        mPie?.data = pieData
        mPie?.legend!!.isEnabled = false
        mPie?.description!!.isEnabled = false
        mPie?.setTouchEnabled(false)

    }

}

