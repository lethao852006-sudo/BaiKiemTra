package com.example.employeeinfo_2415141122120

import android.os.Bundle
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
            thamNien = 2
        )

        findViewById<android.widget.TextView>(R.id.tvMaNhanVien).text =
            "Mã nhân viên: ${nhanVien.maNhanVien}"

        findViewById<android.widget.TextView>(R.id.tvHoTen).text =
            "Họ tên: ${nhanVien.hoTen}"

        findViewById<android.widget.TextView>(R.id.tvPhongBan).text =
            "Phòng ban: ${nhanVien.phongBan}"

        findViewById<android.widget.TextView>(R.id.tvTuoi).text =
            "Tuổi: ${nhanVien.tuoi}"

        findViewById<android.widget.TextView>(R.id.tvLuong).text =
            "Lương: ${nhanVien.luong}"

        findViewById<android.widget.TextView>(R.id.tvGioiTinh).text =
            "Giới tính: ${nhanVien.gioiTinh}"

        findViewById<android.widget.TextView>(R.id.tvThamNien).text =
            "Thâm niên: ${nhanVien.thamNien} năm"
    }
}