package com.example.baitap2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Khai báo các phần tử giao diện
    private lateinit var editText: EditText
    private lateinit var buttonSave: Button
    private lateinit var buttonCancel: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Liên kết các phần tử với mã bằng id
        editText = findViewById(R.id.editTextName)
        buttonSave = findViewById(R.id.button_save)
        buttonCancel = findViewById(R.id.button_cancel)

        // Thiết lập sự kiện khi nhấn nút "Lưu"
        buttonSave.setOnClickListener {
            val userName = editText.text.toString()
            if (userName.isNotEmpty()) {
                Toast.makeText(this, "Tên đã được lưu: $userName", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Vui lòng nhập tên trước khi lưu!", Toast.LENGTH_SHORT).show()
            }
        }

        // Thiết lập sự kiện khi nhấn nút "Hủy"
        buttonCancel.setOnClickListener {
            // Xóa nội dung trong EditText
            editText.text.clear()
            Toast.makeText(this, "Đã hủy nhập tên", Toast.LENGTH_SHORT).show()
        }
    }
}