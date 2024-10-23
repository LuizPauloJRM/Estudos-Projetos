import React, { useState } from 'react';

const Notes = () => {
    const [note, setNote] = useState('');
    const [notes, setNotes] = useState([]);

    const addNote = () => {
        if (note) {
            setNotes([...notes, note]);
            setNote('');
        }
    };

    return (
        <div>
            <h2>Anotações</h2>
            <textarea
                value={note}
                onChange={(e) => setNote(e.target.value)}
                placeholder="Escreva sua anotação"
            />
            <button onClick={addNote}>Adicionar</button>
            <ul>
                {notes.map((n, index) => (
                    <li key={index}>{n}</li>
                ))}
            </ul>
        </div>
    );
};

export default Notes;
