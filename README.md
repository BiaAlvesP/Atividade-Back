# API de Chamados - Fila, Pilha e Lista

### Integrantes
- Bianca Alves Pinheiro
- Gabriel Nogueira
- Isaias Oliveira
- Matheus Marques

### 💡 Descrição
API REST para gerenciamento de chamados técnicos:
- Chamados normais → Fila (FIFO)
- Chamados de emergência → Pilha (LIFO)
- Histórico → Lista com todos os chamados criados e atendidos

### ⚙️ Endpoints

| Método | Endpoint | Descrição |
|--------|-----------|-----------|
| POST | /chamados/comum | Cria um novo chamado (chamado`) |
| GET | /chamados/espera | Lista todos os chamados em espera |
| DELETE | /chamados/comum/atender | Resolver chamadas comums |
| POST | /chamados/emergencia | Cria um novo chamado urgente(chamado`) |
| GET | /chamados/emergencia/espera | Lista todos os chamados emergencial em espera |
| DELETE | /chamados/emergnecia/resolver | Resolver chamadas emergencial |
| GET | /chamados/historico | Mostra todos os chamados já resolvidas |
| GET | /chamados/estatisticas | Mostra estatísticas gerais |



### 🔧 Como testar
```bash
git clone https://github.com/BiaAlvesP/Atividade-Back.git
```

Criar chamado comum
POST → http://localhost:8080/chamados/comum
```json
{
  "chamado": "Computador travando",
  "cliente": "Maria"
}
```
Criar chamado emergência
```json
Criar chamado de emergência
POST → http://localhost:8080/chamados/emergencia
{
  "chamado": "Servidor caiu",
  "cliente": "João"
}
```
