package com.example.employeeinfo_2415141122120

import java.text.NumberFormat
import java.util.Locale

fun Employee.hienThiThongTin(): String {

    val dinhDangTien = NumberFormat.getNumberInstance(Locale("vi", "VN"))
    dinhDangTien.maximumFractionDigits = 0

    return """
        Mã nhân viên: $maNhanVien
        
        Họ tên: $hoTen
        
        Phòng ban: $phongBan
        
        Tuổi: $tuoi
        
        Lương: ${dinhDangTien.format(luong)} VNĐ
        
        Giới tính: $gioiTinh
        
        Thâm niên: $thamNien năm
        
        Email: $email
    """.trimIndent()
}