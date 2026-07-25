<div align="center">

# ⏳ get-backtofuture

### Interactive local AI assistant with live web search, streaming answers, and full conversation history.

Bring offline GGUF local models back online using **llama.cpp** and **DuckDuckGo Search**. Ask real-time questions, stream responses token-by-token, and inspect full session analytics directly in your terminal.

![Python](https://img.shields.io/badge/Python-3.10+-blue.svg)
![llama.cpp](https://img.shields.io/badge/LLM-llama.cpp-green)
![DuckDuckGo](https://img.shields.io/badge/Search-DuckDuckGo-orange)
![Rich](https://img.shields.io/badge/UI-Rich--CLI-purple)
![License](https://img.shields.io/badge/Status-Active-success)

</div>

<p align="center">
  <img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" alt="Python" />
  <img src="https://img.shields.io/badge/llama.cpp-4B5563?style=for-the-badge&logo=meta&logoColor=white" alt="llama.cpp" />
  <img src="https://img.shields.io/badge/DuckDuckGo-DE5833?style=for-the-badge&logo=duckduckgo&logoColor=white" alt="DuckDuckGo" />
  <img src="https://img.shields.io/badge/Linux-FCC624?style=for-the-badge&logo=linux&logoColor=black" alt="Linux" />
</p>

---

## 💡 Key Features

* **🌐 Real-Time Web Search Integration:** Live DuckDuckGo search results automatically synthesized into system prompts.
* **💬 Interactive REPL & Single-Shot Modes:** Use as an ongoing terminal chat session or run quick single-prompt commands.
* **⚡ Token Streaming & Stats:** Instant token-by-token output along with generation metrics (`tok/s`, latency, token breakdown).
* **🧠 Conversation Management:** Context trimming prevents RAM/token overflow across long chat sessions.
* **🎨 Rich Terminal Formatting:** Clean UI themes, spinners, panels, and markdown rendering (with graceful fallback).

---

## 📦 Requirements & Installation

### 1. Clone the Repository

```bash
git clone [https://github.com/nexus-being-787/get-backtofuture.git](https://github.com/nexus-being-787/get-backtofuture.git)
cd get-backtofuture
