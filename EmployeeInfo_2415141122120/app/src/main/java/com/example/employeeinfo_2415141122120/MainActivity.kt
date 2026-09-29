package com.example.employeeinfo_2415141122120

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.employeeinfo_2415141122120.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

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

        binding.tvThongTin.text = nhanVien.hienThiThongTin()
    }
}