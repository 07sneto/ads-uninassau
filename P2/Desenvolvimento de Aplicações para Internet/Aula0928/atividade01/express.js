const express = require('express');

const app = express();
const PORT = 3000;

app.get('/', (req, res) => {
  res.send('Minha primeira API :)');
});

app.get('/segundapagina', (req, res) => {
  res.send('Segunda pagina da API do SN.');
});

app.listen(PORT, () => {
    console.log(`Servidor rodando na porta ${PORT}`);
});
