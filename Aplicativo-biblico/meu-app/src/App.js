import React from 'react';
import TodoList from './components/TodoList';
import CalendarComponent from './components/Calendar';
import Notes from './components/Notes';
import Bible from './components/Bible';
import './index.css';

const App = () => {
    return (
        <div className="App">
            <h1>Meu Aplicativo de Notas</h1>
           
            <CalendarComponent />
            <Notes />
            <Bible />
        </div>
    );
};

export default App;
