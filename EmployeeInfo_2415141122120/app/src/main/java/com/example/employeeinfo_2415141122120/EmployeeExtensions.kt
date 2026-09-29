package com.example.employeeinfo_2415141122120

fun Employee.hienThiThongTin(): String {
    return """
        Mã nhân viên: $maNhanVien
        Họ tên: $hoTen
        Phòng ban: $phongBan
        Tuổi: $tuoi
        Lương: $luong
        Giới tính: $gioiTinh
        Thâm niên: $thamNien năm
    """.trimIndent()
}