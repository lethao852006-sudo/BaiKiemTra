package com.example.employeeinfo_2415141122120

fun Employee.hienThiThongTin(): String {
    return """
        Mã nhân viên: $maNhanVien
        Họ tên: $hoTen
        Phòng ban: $phongBan
        Tuổi: $tuoi
        Lương: ${luong.dinhDangTien()}
        Giới tính: $gioiTinh
        Thâm niên: $thamNien năm
        Email: $email
    """.trimIndent()
}
fun Double.dinhDangTien(): String {
    return "%,.0f VNĐ".format(this)
}