package com.richard.myapplication.ui.Orders.repository

import androidx.lifecycle.MutableLiveData
import com.richard.myapplication.models.OrderStatus
import com.richard.myapplication.models.Orders
import com.richard.myapplication.models.Product
import java.util.*
import kotlin.collections.ArrayList

object OrderDataSource {
    private lateinit var dataSet : ArrayList<Orders>


    init {
         System.out.println("Init datatSourse Singleton")
    }

    //Pretend to get data from web service or online source
    fun getOrdersfromSource() : MutableLiveData<ArrayList<Orders>>{
        setData()
        val data  = MutableLiveData<ArrayList<Orders>>()
        data.value = dataSet
        return data;
    }

    // This is to mimic data source from online. so we would just manually add data to our drders
    private fun setData(){
        val products = ArrayList<Product>()
        products.add(Product("Shirt", 200.00,"Skieie8", "9202934"))
        products.add(Product("Trousers", 300.00,"trousers", "398374"))
        products.add(Product("Boxers", 24.00,"Information", "4645363"))
        products.add(Product("Skirt", 34.34,"365eggd", "272373"))
        dataSet.add(Orders(UUID.fromString("Oder 1"), Date(),OrderStatus.PROCESSING,
        "DHL",products))
        dataSet.add(Orders(UUID.fromString("Oder 5"), Date(),OrderStatus.PROCESSING,
            "DHL",products))
        dataSet.add(Orders(UUID.fromString("Oder 4"), Date(),OrderStatus.PROCESSING,
            "DHL",products))
        dataSet.add(Orders(UUID.fromString("Oder 3"), Date(),OrderStatus.PROCESSING,
            "DHL",products))
        dataSet.add(Orders(UUID.fromString("Oder 11"), Date(),OrderStatus.PROCESSING,
            "DHL",products))
    }
}