<div align="center">

# ⏳ get-backtofuture

### Give your local LLM access to the live web.

**get-backtofuture** combines **llama.cpp** with **DuckDuckGo Search** to create an interactive AI assistant that answers using both your local GGUF model and real-time web results—all from the terminal.

<p>
  <img src="https://img.shields.io/badge/Python-3.10+-3776AB?style=for-the-badge&logo=python&logoColor=white" />
  <img src="https://img.shields.io/badge/llama.cpp-Local%20LLM-4B5563?style=for-the-badge" />
  <img src="https://img.shields.io/badge/DuckDuckGo-Live%20Search-DE5833?style=for-the-badge&logo=duckduckgo&logoColor=white" />
  <img src="https://img.shields.io/badge/Rich-Terminal%20UI-7F52FF?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Linux-Compatible-FCC624?style=for-the-badge&logo=linux&logoColor=black" />
</p>

</div>

<p align="center">
  <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" alt="Python" />
  <img src="https://img.shields.io/badge/llama.cpp-4B5563?style=for-the-badge&logo=meta&logoColor=white" alt="llama.cpp" />
  <img src="https://img.shields.io/badge/DuckDuckGo-DE5833?style=for-the-badge&logo=duckduckgo&logoColor=white" alt="DuckDuckGo" />
  <img src="https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black" alt="Linux" />
</p>


---

## ✨ Features

- 🌐 **Live Web Search** using DuckDuckGo
- 🤖 **Runs entirely with local GGUF models** via `llama.cpp`
- ⚡ **Real-time token streaming**
- 💬 **Interactive chat mode** with persistent conversation history
- 📜 **Single prompt mode** for quick queries
- 🧠 **Automatic context management** for long conversations
- 📊 **Generation statistics**
  - Tokens/sec
  - Latency
  - Prompt tokens
  - Completion tokens
- 🎨 **Beautiful terminal interface** powered by Rich
- 🔄 Toggle web search without restarting the application

---

# 📦 Installation

## Clone the repository

```bash
git clone https://github.com/nexus-being-787/get-backtofuture.git
cd get-backtofuture
```

## Create a virtual environment

```bash
python -m venv venv
```

### Activate

**Linux/macOS**

```bash
source venv/bin/activate
```

**Fish Shell**

```bash
source venv/bin/activate.fish
```

**Windows**

```powershell
venv\Scripts\activate
```

## Install dependencies

```bash
pip install llama-cpp-python ddgs rich
```

---

# 🚀 Usage

## Interactive Chat

```bash
python online.py \
    -m ~/Models/Phi-4-mini-instruct-Q4_K_M.gguf \
    --n-threads 8
```

---

## Single Prompt

```bash
python online.py \
    -m ~/Models/Phi-4-mini-instruct-Q4_K_M.gguf \
    -p "What are the best open-source alternatives to WhatsApp?"
```

---

# 💬 Interactive Commands

| Command | Description |
|----------|-------------|
| `/clear` | Clear conversation history |
| `/history` | Show current session history |
| `/nosearch` | Toggle live web search |
| `/quit` | Exit the application |

---

# ⚙ Configuration

| Option | Description | Default |
|---------|-------------|---------|
| `-m, --model` | Path to GGUF model | **Required** |
| `--n-ctx` | Context window | `4096` |
| `--n-threads` | CPU threads | `4` |
| `--n-gpu-layers` | GPU layers (`-1` = all) | `0` |
| `--max-tokens` | Maximum generated tokens | `512` |
| `--temperature` | Sampling temperature | `0.2` |
| `--results` | Number of web search results | `5` |
| `--no-search` | Disable live search | `False` |

---

# 🏗 How It Works

```text
          User Prompt
               │
               ▼
      DuckDuckGo Search
               │
               ▼
      Search Context Builder
               │
               ▼
      Local GGUF Model
         (llama.cpp)
               │
               ▼
      Streaming Response
               │
               ▼
      Rich Terminal UI
```

---

# 📁 Project Structure

```text
get-backtofuture/
│
├── online.py          # Main application
├── README.md
├── requirements.txt
└── LICENSE
```

---

# 🛠 Built With

- Python
- llama.cpp
- llama-cpp-python
- DuckDuckGo Search (ddgs)
- Rich

---

# 📄 License

This project is licensed under the MIT License.

---

<div align="center">

### ⭐ If you found this project useful, consider giving it a star!

**Built for developers who want the speed and privacy of local AI without giving up live web knowledge.**

</div>
