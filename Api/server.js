import express from 'express';
import pkg from '@prisma/client';

const { PrismaClient } = pkg;
const prisma = new PrismaClient();
const app = express();
app.use(express.json());

// Endpoint para criar um usuário (POST)
app.post('/usuarios', async (req, res) => {
    const user = await prisma.user.create({
        data: {
            email: req.body.email,
            name: req.body.name,
            age: req.body.age
        }
    });
    res.status(201).json(user); // Envia o usuário criado como resposta em JSON
});

// Endpoint para atualizar um usuário (PUT)
app.put('/usuarios/:id', async (req, res) => {

    const user = await prisma.user.update({
        where: {
            id: req.params.id
        },
        data: {
            email: req.body.email,
            name: req.body.name,
            age: req.body.age
        }
    });
    res.status(200).json(user);
});

// Endpoint para deletar um usuário (DELETE)
app.delete('/usuarios/:id', async (req, res) => {
    await prisma.user.delete({
        where: {
            id: parseInt(req.params.id)
        }
    });
    res.status(200).json({ message: 'Usuário foi deletado com sucesso!' });
});

// Endpoint para listar todos os usuários (GET)
app.get('/usuarios', async (req, res) => {

    if (req.query) {
        users = await prisma.user.findMany({
    where: {
        name: req.query.name,
            email: req.query.email,
                age: req.query.age
    }
})
        
    }else {

}

const users = await prisma.user.findMany();
res.status(200).json(users); // Retorna a lista de usuários
});

app.listen(3001, () => console.log('Servidor rodando na porta 3001'));



/*Tipo de rota , / Método HTTP , endereço */

/*
Criar listagem de usuários API
    -Criar usuários
    -Listar todos os usuários
    -Editar um usuário
    -Deletar 
*/
