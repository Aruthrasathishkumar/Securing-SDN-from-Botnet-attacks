# Securing SDN from Botnet Attacks

This project provides a lightweight, Java-based system for detecting and mitigating botnet attacks in Software Defined Networks (SDNs). Centralized SDN controllers are vulnerable to malicious traffic patterns orchestrated by botnets. This tool aims to identify such threats early and respond by modifying flow rules dynamically.

The system uses a GUI interface to visualize network activity and apply mitigation strategies in real-time. It is built using Java Swing and styled with the Synthetica Look and Feel library. The architecture is modular, allowing easy extension for additional detection algorithms or controller integrations.

### 🔧 Features

- Detection of botnet-like network behavior
- Real-time alerts via GUI interface
- Automated mitigation by altering flow rules
- Clean, extensible Java codebase
- Ant-based build support

### 🚀 Getting Started

1. **Requirements**: JDK 1.7+, NetBeans IDE or Ant
2. **Clone the repository**:
   ```bash
   git clone https://github.com/Aruthrasathishkumar/Securing-SDN-from-Botnet-attacks.git
3. **Add Dependencies**:

Before building the project, create a `libs/` folder in the project root and add the following external libraries:

- [`synthetica.jar`](https://www.jtattoo.net)
- `syntheticaBlueLight.jar`

These libraries are required to support the custom GUI theme used in the Java application.
4. **Build and run**:
Use NetBeans or run:
ant clean
ant build
ant run
