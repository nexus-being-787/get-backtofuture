<div align="center">

# ⏳ get-backtofuture

### Bring offline GGUF local models back online with real-time duckduckgo search capability.

Connect your local GGUF models directly to the web, enabling live search results and retrieval without relying on external API limits.

![Python](https://img.shields.io/badge/Python-3.10+-blue.svg)
![llama.cpp](https://img.shields.io/badge/LLM-llama.cpp-green)
![DuckDuckGo](https://img.shields.io/badge/Search-DuckDuckGo-orange)
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

* **🌐 Real-Time Web Search:** Fetch up-to-date web results using DuckDuckGo directly before passing context to your model.
* **🧠 Local LLM Execution:** Process queries locally using GGUF quantization models via `llama.cpp`.
* **⚡ Lightweight & Fast:** Minimal dependencies, designed to run directly from your terminal environment.

---

## 📦 Requirements

* **Python 3.10+**
* A local GGUF model (e.g., `Phi-4`, `Qwen2.5`, or `DeepSeek`)
* `ddgs` (DuckDuckGo Search library)

---

## 🚀 Quick Start

### 1. Clone the Repository

```bash
git clone [https://github.com/nexus-being-787/get-backtofuture.git](https://github.com/nexus-being-787/get-backtofuture.git)
cd get-backtofuture
