# API de Chamados - Fila, Pilha e Lista

### Integrantes
- Bianca Alves Pinheiro
- Gabriel Nogueira
- Isaias Oliveira 

### 💡 Descrição
API REST para gerenciamento de chamados técnicos:
- Chamados normais → Fila (FIFO)
- Chamados de emergência → Pilha (LIFO)
- Histórico → Lista com todos os chamados criados e atendidos

### ⚙️ Endpoints

| Método | Endpoint | Descrição |
|--------|-----------|-----------|
| POST | /chamados/criar | Cria um novo chamado (chamado`) |
| POST | /chamados/urgencua | Cria um novo chamado urgente(chamado`) |
| GET | /chamados/espera | Lista todos os chamados em espera |
| POST | /chamados| Atende o próximo chamado (`normal` ou `emergencia`) |
| GET | /chamados | Mostra todos os chamados (resolvidos ou não) |
| GET | /chamados/estatisticas | Mostra estatísticas gerais |

### 🔧 Exemplo de criação
```bash
git clone https://github.com/BiaAlvesP/Atividade-Back.git
```

