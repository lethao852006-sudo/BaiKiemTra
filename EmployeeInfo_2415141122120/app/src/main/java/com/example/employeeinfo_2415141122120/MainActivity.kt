package com.example.employeeinfo_2415141122120

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nhanVien = Employee(
            maNhanVien = "NV2120",
            hoTen = "Lê Thị Minh Thảo",
            phongBan = "Phòng Công nghệ thông tin",
            tuoi = 20,
            luong = 15000000.0,
            gioiTinh = "Nữ",
            thamNien = 2,
            email = "minhthao2415141122120@gmail.com"
        )

        val tvThongTin = findViewById<TextView>(R.id.tvThongTin)

        tvThongTin.text = nhanVien.hienThiThongTin()
    }
}