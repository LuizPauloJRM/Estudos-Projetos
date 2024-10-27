import React, { useState } from 'react'; // Importando React e useState
import './style.css';
import Trash from '../../assets/trash.svg';

function Home() {
   const [users, setUsers] = useState([ // Estado para armazenar os usuários
      {
         id: '21a2s4241221',
         name: 'Ronaldo',
         age: 34,
         email: 'rod@gmail.com',
      },
      {
         id: '2144sdfsd564',
         name: 'Aline',
         age: 32,
         email: 'Aline@gmail.com',
      },
   ]);

   const [formData, setFormData] = useState({ // Estado para os dados do formulário
      nome: '',
      idade: '',
      email: '',
   });

   const handleInputChange = (e) => {
      const { name, value } = e.target;
      setFormData({ ...formData, [name]: value }); // Atualiza os dados do formulário
   };

   const handleSubmit = (e) => {
      e.preventDefault(); // Previne o comportamento padrão de envio do formulário
      const newUser = {
         id: Date.now().toString(), // Gera um ID único
         name: formData.nome,
         age: formData.idade,
         email: formData.email,
      };
      setUsers([...users, newUser]); // Adiciona o novo usuário
      setFormData({ nome: '', idade: '', email: '' }); // Limpa os campos do formulário
   };

   const handleDeleteUser = (id) => {
      setUsers(users.filter(user => user.id !== id)); // Remove o usuário com o ID correspondente
   };

   return (
      <div className='container'>
         <form onSubmit={handleSubmit}> {/* Adiciona a função de envio */}
            <h1>Cadastro</h1>
            <input
               name='nome'
               type='text'
               value={formData.nome}
               onChange={handleInputChange} // Atualiza os dados do formulário
               placeholder='Nome'
               required
            />
            <input
               name='idade'
               type='number'
               value={formData.idade}
               onChange={handleInputChange} // Atualiza os dados do formulário
               placeholder='Idade'
               required
            />
            <input
               name='email'
               type='email'
               value={formData.email}
               onChange={handleInputChange} // Atualiza os dados do formulário
               placeholder='Email'
               required
            />
            <button type='submit'>Cadastrar</button> {/* Muda para type='submit' */}
         </form>
         {users.map(user => (
            <div key={user.id}>
               <div>
                  <p>Nome: {user.name}</p>
                  <p>Idade: {user.age}</p>
                  <p>Email: {user.email}</p>
                  <button onClick={() => handleDeleteUser(user.id)}> {/* Botão para deletar */}
                     <img src={Trash} alt='Deletar' />
                  </button>
               </div>
            </div>
         ))}
      </div>
   );
}

export default Home;
