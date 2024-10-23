import React from 'react';

const Bible = () => {
    const verses = [
        "1. No princípio, Deus criou os céus e a terra.",
        "2. E a terra era sem forma e vazia; e havia trevas sobre a face do abismo.",
        "3. E disse Deus: Haja luz; e houve luz.",
    ];

    return (
        <div>
            <h2>Bíblia</h2>
            <ul>
                {verses.map((verse, index) => (
                    <li key={index}>{verse}</li>
                ))}
            </ul>
        </div>
    );
};

export default Bible;
