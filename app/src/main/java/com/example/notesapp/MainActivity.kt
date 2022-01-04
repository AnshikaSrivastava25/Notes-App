package com.example.notesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity(), NoteClickInterface, NoteClickDeleteInterface {
    lateinit var notesRV: RecyclerView
    lateinit var addFAB: FloatingActionButton
    lateinit var viewModel: NotesViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        notesRV = findViewById(R.id.idRvNotes)
        addFAB = findViewById(R.id.idFABAddNote)
        notesRV.layoutManager= LinearLayoutManager(this)

        val noteRVAdapter = NoteRVAdapter(this,this,this)
        notesRV.adapter = noteRVAdapter
        viewModel = ViewModelProvider(this,ViewModelProvider.AndroidViewModelFactory.getInstance(application)).get(NotesViewModel::class.java)
        viewModel.allNote.observe(this, Observer { list->
            list?.let {
                noteRVAdapter.updateList(it)
            }
        })
        addFAB.setOnClickListener {
            val intent = Intent(this@MainActivity,AddEditNoteActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }


    override fun onDeleteIconClick(note: Note) {
        viewModel.deleteNote(note)
        Toast.makeText(this,"${note.noteTitle}Deleted", Toast.LENGTH_SHORT).show()
    }

    override fun onNoteClick(note: Note) {
        val intent = Intent(this@MainActivity, AddEditNoteActivity::class.java)
        intent.putExtra("noteType","Edit")
        intent.putExtra("noteTitle",note.noteTitle)
        intent.putExtra("noteDescription",note.noteDescription)
        intent.putExtra("noteID",note.id)
        startActivity(intent)
        this.finish()
    }
}