import React, { useState } from 'react';
import Calendar from 'react-calendar';
import 'react-calendar/dist/Calendar.css';

const CalendarComponent = () => {
    const [date, setDate] = React.useState(new Date());

    return (
        <div>
            <h2>Calendário</h2>
            <Calendar onChange={setDate} value={date} />
        </div>
    );
};

export default CalendarComponent;
