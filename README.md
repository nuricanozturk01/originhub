<div id="top">

<!-- HEADER STYLE: CLASSIC -->
<div align="center">


# ORIGINHUB

<em>Empowering Seamless Collaboration, Unleashing Innovation</em>

<!-- BADGES -->
<img src="https://img.shields.io/github/license/nuricanozturk01/originhub?style=flat&logo=opensourceinitiative&logoColor=white&color=0080ff" alt="license">
<img src="https://img.shields.io/github/last-commit/nuricanozturk01/originhub?style=flat&logo=git&logoColor=white&color=0080ff" alt="last-commit">
<img src="https://img.shields.io/github/languages/top/nuricanozturk01/originhub?style=flat&color=0080ff" alt="repo-top-language">
<img src="https://img.shields.io/github/languages/count/nuricanozturk01/originhub?style=flat&color=0080ff" alt="repo-language-count">

<em>Built with the tools and technologies:</em>

<img src="https://img.shields.io/badge/JSON-000000.svg?style=flat&logo=JSON&logoColor=white" alt="JSON">
<img src="https://img.shields.io/badge/Markdown-000000.svg?style=flat&logo=Markdown&logoColor=white" alt="Markdown">
<img src="https://img.shields.io/badge/Spring-000000.svg?style=flat&logo=Spring&logoColor=white" alt="Spring">
<img src="https://img.shields.io/badge/npm-CB3837.svg?style=flat&logo=npm&logoColor=white" alt="npm">
<img src="https://img.shields.io/badge/PostCSS-DD3A0A.svg?style=flat&logo=PostCSS&logoColor=white" alt="PostCSS">
<img src="https://img.shields.io/badge/Prettier-F7B93E.svg?style=flat&logo=Prettier&logoColor=black" alt="Prettier">
<img src="https://img.shields.io/badge/.ENV-ECD53F.svg?style=flat&logo=dotenv&logoColor=black" alt=".ENV">
<img src="https://img.shields.io/badge/JavaScript-F7DF1E.svg?style=flat&logo=JavaScript&logoColor=black" alt="JavaScript">
<br>
<img src="https://img.shields.io/badge/DaisyUI-1AD1A5.svg?style=flat&logo=DaisyUI&logoColor=white" alt="DaisyUI">
<img src="https://img.shields.io/badge/Docker-2496ED.svg?style=flat&logo=Docker&logoColor=white" alt="Docker">
<img src="https://img.shields.io/badge/XML-005FAD.svg?style=flat&logo=XML&logoColor=white" alt="XML">
<img src="https://img.shields.io/badge/TypeScript-3178C6.svg?style=flat&logo=TypeScript&logoColor=white" alt="TypeScript">
<img src="https://img.shields.io/badge/ESLint-4B32C3.svg?style=flat&logo=ESLint&logoColor=white" alt="ESLint">
<img src="https://img.shields.io/badge/datefns-770C56.svg?style=flat&logo=date-fns&logoColor=white" alt="datefns">
<img src="https://img.shields.io/badge/YAML-CB171E.svg?style=flat&logo=YAML&logoColor=white" alt="YAML">

</div>
<br>

---

## 📄 Table of Contents

- [Overview](#-overview)
- [Getting Started](#-getting-started)
    - [Prerequisites](#-prerequisites)
    - [Installation](#-installation)
    - [Usage](#-usage)
    - [Testing](#-testing)
- [Features](#-features)
- [Roadmap](#-roadmap)
- [Contributing](#-contributing)
- [License](#-license)
- [Acknowledgment](#-acknowledgment)

---

## ✨ Overview

originhub is a powerful developer tool that provides a complete backend and frontend infrastructure for managing repositories, code collaboration, and secure deployments. Designed for scalability and security, it integrates version control, pull requests, and user management into a unified platform.

**Why originhub?**

This project simplifies complex development workflows with:

- 🧩 **Repository Management:** Seamlessly handle branches, commits, and file browsing.
- 🔑 **Secure SSH Keys:** Manage encrypted access with robust SSH key handling.
- 📝 **Code Collaboration:** Streamline pull requests, reviews, and comments.
- 🛠️ **Multi-Tenant User Control:** Support multiple users with fine-grained permissions.
- 🚀 **Automated Deployment:** Containerized backend and frontend for reliable releases.
- 🔒 **Built-in Security & Error Handling:** Ensure data integrity and system robustness.

---

## 📌 Features

|      | Component       | Details                                                                                     |
| :--- | :-------------- | :------------------------------------------------------------------------------------------ |
| ⚙️  | **Architecture**  | <ul><li>Microservices-oriented backend with Spring Boot</li><li>Angular frontend SPA</li></ul> |
| 🔩 | **Code Quality**  | <ul><li>Uses Checkstyle and SpotBugs for static analysis</li><li>Consistent code formatting with Prettier and ESLint</li></ul> |
| 📄 | **Documentation** | <ul><li>Includes `docker-compose.yml`, `originhub-backend/Dockerfile` for setup</li><li>Configuration files like `application.yaml`, `README.md` (assumed)</li></ul> |
| 🔌 | **Integrations**  | <ul><li>CI/CD via Docker, Vercel, Maven, npm scripts</li><li>Java Spring Boot with Maven dependencies</li><li>Frontend built with Angular and Tailwind CSS</li></ul> |
| 🧩 | **Modularity**    | <ul><li>Backend modules separated by Maven modules (`pom.xml`)</li><li>Frontend components organized in Angular modules</li></ul> |
| 🧪 | **Testing**       | <ul><li>Backend tests via JUnit, SpotBugs</li><li>Frontend tests likely via Jasmine/Karma (implied by Angular setup)</li></ul> |
| ⚡️  | **Performance**   | <ul><li>Uses Tailwind CSS for optimized styling</li><li>Docker containers for isolated environments</li></ul> |
| 🛡️ | **Security**      | <ul><li>Spring Security integrations (implied by dependencies)</li><li>SSH host key present for secure server access</li></ul> |
| 📦 | **Dependencies**  | <ul><li>Backend: Spring Boot, Guava, Jackson, MapStruct, SpotBugs</li><li>Frontend: Angular, TailwindCSS, ESLint, TypeScript, RxJS</li></ul> |

---

### 📑 Project Index

<details open>
	<summary><b><code>ORIGINHUB/</code></b></summary>
	<!-- __root__ Submodule -->
	<details>
		<summary><b>__root__</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ __root__</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/docker-compose.yml'>docker-compose.yml</a></b></td>
					<td style='padding: 8px;'>- Defines and configures a PostgreSQL database service within a Docker Compose environment, establishing a dedicated container for data storage and management<br>- Facilitates seamless integration of the database into the overall architecture, enabling persistent data handling and supporting backend operations for the project<br>- Ensures consistent database setup across development and deployment environments.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/README.md'>README.md</a></b></td>
					<td style='padding: 8px;'>- Provides an overview of the forge project, outlining its core purpose within the overall architecture<br>- It highlights how forge facilitates development workflows, integrates essential components, and supports the deployment process, ensuring seamless collaboration and efficient management of the systems infrastructure<br>- This summary emphasizes forges role in maintaining a cohesive and scalable architecture.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/ssh_host_key'>ssh_host_key</a></b></td>
					<td style='padding: 8px;'>- Provides a secure SSH host key essential for establishing trusted, encrypted communication channels within the system architecture<br>- It underpins secure remote access and authentication processes, ensuring data integrity and confidentiality across interconnected components in the overall infrastructure<br>- This key is fundamental to maintaining the security posture of the deployment environment.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/pom.xml'>pom.xml</a></b></td>
					<td style='padding: 8px;'>- Defines project dependencies, plugins, and build configurations for a Java-based microservices architecture utilizing Spring Boot and Cloud<br>- Ensures consistent dependency management, code quality, and compliance across modules, facilitating streamlined development, testing, and deployment processes within the overall system<br>- Serves as the foundational configuration for maintaining project standards and integrations.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- originhub-backend Submodule -->
	<details>
		<summary><b>originhub-backend</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ originhub-backend</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/Dockerfile'>Dockerfile</a></b></td>
					<td style='padding: 8px;'>- Defines the Docker environment for the Forge backend, enabling consistent deployment and execution of the application<br>- It packages the backend service into a lightweight container, ensuring reliable runtime behavior and resource management within the overall architecture<br>- This setup facilitates scalable, isolated, and reproducible deployment of the backend component in the project ecosystem.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/pom.xml'>pom.xml</a></b></td>
					<td style='padding: 8px;'>- Defines the core dependencies and build configuration for the backend service, enabling functionalities such as REST API endpoints, database interactions with PostgreSQL, data validation, security, and monitoring<br>- It orchestrates the integration of essential frameworks and tools to support scalable, secure, and maintainable server-side operations within the overall architecture.</td>
				</tr>
			</table>
			<!-- src Submodule -->
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ originhub-backend.src</b></code>
					<!-- main Submodule -->
					<details>
						<summary><b>main</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ originhub-backend.src.main</b></code>
							<!-- resources Submodule -->
							<details>
								<summary><b>resources</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-backend.src.main.resources</b></code>
									<table style='width: 100%; border-collapse: collapse;'>
									<thead>
										<tr style='background-color: #f8f9fa;'>
											<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
											<th style='text-align: left; padding: 8px;'>Summary</th>
										</tr>
									</thead>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/resources/application.yaml'>application.yaml</a></b></td>
											<td style='padding: 8px;'>- Defines core server configurations, including network settings, security protocols, database connections, and OAuth2 integrations, to support the backend architecture of the OriginHub platform<br>- Facilitates secure, scalable, and flexible deployment of services, ensuring seamless authentication, data management, and communication within the overall system ecosystem.</td>
										</tr>
										<tr style='border-bottom: 1px solid #eee;'>
											<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/resources/ssh_host_key'>ssh_host_key</a></b></td>
											<td style='padding: 8px;'>- Provides a secure SSH host key used for authenticating and establishing encrypted connections within the backend infrastructure<br>- Integral to the overall security architecture, it ensures trusted communication channels for remote management and data transfer, supporting the systems integrity and confidentiality in the project’s architecture.</td>
										</tr>
									</table>
								</blockquote>
							</details>
							<!-- java Submodule -->
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-backend.src.main.java</b></code>
									<!-- com Submodule -->
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-backend.src.main.java.com</b></code>
											<!-- nuricanozturk Submodule -->
											<details>
												<summary><b>nuricanozturk</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk</b></code>
													<!-- originhub Submodule -->
													<details>
														<summary><b>originhub</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/OriginHubApplication.java'>OriginHubApplication.java</a></b></td>
																	<td style='padding: 8px;'>- Bootstraps the OriginHub backend application, establishing the core Spring Boot setup and initializing the application environment<br>- It serves as the entry point for launching the service, ensuring proper startup procedures and logging, thereby enabling the entire system to operate within a structured, maintainable architecture.</td>
																</tr>
															</table>
															<!-- ssh Submodule -->
															<details>
																<summary><b>ssh</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.ssh</b></code>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.ssh.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/ssh/controllers/SshKeyController.java'>SshKeyController.java</a></b></td>
																					<td style='padding: 8px;'>- Manages user SSH keys by providing endpoints to list, add, and delete keys within the applications architecture<br>- Facilitates secure SSH key handling tied to authenticated users, enabling seamless key management and integration with user-specific workflows in the backend system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- repositories Submodule -->
																	<details>
																		<summary><b>repositories</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.ssh.repositories</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/ssh/repositories/SshKeyRepository.java'>SshKeyRepository.java</a></b></td>
																					<td style='padding: 8px;'>- Provides data access methods for managing SSH key entities within the system, enabling retrieval, verification, and deletion of SSH keys associated with tenants<br>- Facilitates efficient handling of SSH key lifecycle operations, supporting secure access management and ensuring proper linkage between SSH keys and tenant information in the overall architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.ssh.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/ssh/dtos/AddSshKeyForm.java'>AddSshKeyForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for adding SSH keys, encapsulating key attributes such as title and public key<br>- Facilitates secure and validated submission of SSH key information within the backend architecture, supporting user authentication and access management workflows in the overall system<br>- Ensures data integrity and consistency during SSH key registration processes.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/ssh/dtos/SshKeyInfo.java'>SshKeyInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing SSH key metadata within the backend architecture<br>- It encapsulates key attributes such as unique identifier, title, fingerprint, creation timestamp, and last usage time, facilitating secure management and tracking of SSH keys across the system<br>- This structure supports consistent handling of SSH key information throughout the applications SSH-related functionalities.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- entities Submodule -->
																	<details>
																		<summary><b>entities</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.ssh.entities</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/ssh/entities/SshKey.java'>SshKey.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the SSH key entity within the backend architecture, representing SSH key data associated with tenants<br>- Facilitates storage, retrieval, and management of SSH key attributes such as public key, fingerprint, and usage timestamps, supporting secure access control and key lifecycle tracking across tenant environments in the system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.ssh.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/ssh/services/SshKeyService.java'>SshKeyService.java</a></b></td>
																					<td style='padding: 8px;'>- Manages SSH keys for tenants by enabling listing, addition, and deletion while ensuring key uniqueness through fingerprint validation<br>- Facilitates secure key registration, maintains key metadata, and links keys to tenants, supporting secure access control within the platforms architecture<br>- Handles key lifecycle operations and enforces data integrity across tenant-specific SSH key management.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/ssh/services/ForgeSshServer.java'>ForgeSshServer.java</a></b></td>
																					<td style='padding: 8px;'>- Provides a secure SSH server implementation to facilitate authenticated Git repository access within the platform<br>- Manages SSH key-based authentication, tenant session tracking, and repository command resolution, enabling seamless and controlled version control operations aligned with multi-tenant architecture<br>- Ensures proper security, session management, and repository access control for the overall system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- branch Submodule -->
															<details>
																<summary><b>branch</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.branch</b></code>
																	<!-- mappers Submodule -->
																	<details>
																		<summary><b>mappers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.branch.mappers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/branch/mappers/BranchMapper.java'>BranchMapper.java</a></b></td>
																					<td style='padding: 8px;'>- Provides mapping logic to generate detailed branch information from Git repository data, including commit details and branch status<br>- Facilitates consistent transformation of raw Git references into structured DTOs, supporting repository insights and branch management within the overall architecture<br>- Ensures accurate, standardized representation of branch metadata across the system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.branch.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/branch/controllers/BranchController.java'>BranchController.java</a></b></td>
																					<td style='padding: 8px;'>- Provides RESTful endpoints for managing repository branches, enabling retrieval, creation, deletion, and setting default branches within the project architecture<br>- Facilitates interaction with branch data through standardized HTTP operations, supporting seamless integration and manipulation of branch information in the overall system<br>- Ensures efficient branch lifecycle management aligned with the applications version control workflows.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.branch.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/branch/dtos/SetDefaultBranchForm.java'>SetDefaultBranchForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for setting a default branch within the backend architecture<br>- It encapsulates the necessary input, specifically the branch name, ensuring validation constraints are met<br>- This component facilitates user interactions for selecting a default branch, integrating seamlessly with the overall system to support branch management functionalities.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/branch/dtos/BranchInfo.java'>BranchInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object encapsulating key information about a repository branch, including its name, latest commit details, and default status<br>- Serves as a structured means to communicate branch metadata within the backend architecture, supporting features like branch management, display, and synchronization across services in the overall system.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/branch/dtos/CreateBranchForm.java'>CreateBranchForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for creating a new branch within the project, encapsulating branch name and source branch information<br>- Ensures input validation for naming conventions and required fields, facilitating consistent branch creation workflows and maintaining data integrity across the version control management process.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.branch.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/branch/services/BranchTxService.java'>BranchTxService.java</a></b></td>
																					<td style='padding: 8px;'>- Provides transactional services for managing repository branch configurations, specifically enabling retrieval of repositories by owner and name, and updating the default branch<br>- Integrates with the repository data layer to ensure consistent state changes, supporting the broader architecture of repository management within the system.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/branch/services/BranchNonTxService.java'>BranchNonTxService.java</a></b></td>
																					<td style='padding: 8px;'>- Manages non-transactional operations related to repository branches, including retrieval, creation, deletion, and setting default branches<br>- Facilitates interaction with the underlying Git provider, ensuring branch lifecycle management aligns with project architecture<br>- Supports maintaining branch states and responding to push events, thereby integrating branch control within the overall repository management system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- tree Submodule -->
															<details>
																<summary><b>tree</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.tree</b></code>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.tree.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/tree/controllers/TreeController.java'>TreeController.java</a></b></td>
																					<td style='padding: 8px;'>- Provides REST API endpoints for accessing repository tree structures, file contents, and raw data within a version control system<br>- Facilitates navigation and retrieval of repository components by owner, repository name, and branch, integrating with underlying services to deliver structured responses for frontend or client applications<br>- Supports efficient exploration and data access in the overall architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.tree.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/tree/dtos/EntryType.java'>EntryType.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the EntryType enumeration to categorize items within the version control system, distinguishing between directory structures (TREE) and file contents (BLOB)<br>- It supports the overall architecture by enabling consistent identification and handling of different data types in repository operations, facilitating efficient data management and retrieval within the backends versioning and storage mechanisms.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/tree/dtos/BlobResponse.java'>BlobResponse.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing detailed information about a file or blob within the repository<br>- Facilitates structured communication of file attributes such as path, name, size, content, language, and binary status, supporting features like file browsing, content display, and repository analysis within the overall backend architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/tree/dtos/TreeEntry.java'>TreeEntry.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing a file or directory entry within a version-controlled tree structure<br>- It encapsulates key metadata such as name, path, type, SHA, size, and details of the last commit, facilitating efficient data exchange and display of repository contents in the broader backend architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/tree/dtos/TreeResponse.java'>TreeResponse.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing a tree structure within the repository, encapsulating branch information, directory path, commit SHA, and a list of entries<br>- Facilitates structured communication of repository tree data across different components of the backend, supporting features like repository browsing, version tracking, and hierarchical data management within the overall architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.tree.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/tree/services/TreeNonTxService.java'>TreeNonTxService.java</a></b></td>
																					<td style='padding: 8px;'>- Provides core services for retrieving and navigating repository tree structures and file contents without transactional context<br>- Facilitates listing directory entries, fetching file metadata, and obtaining raw content, supporting features like language detection and binary content identification<br>- Integrates with Git repositories to enable efficient exploration and access to project files within the overall architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- pr Submodule -->
															<details>
																<summary><b>pr</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.pr</b></code>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.pr.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/controllers/PullRequestController.java'>PullRequestController.java</a></b></td>
																					<td style='padding: 8px;'>- Defines REST API endpoints for managing pull requests within repositories, enabling creation, retrieval, updating, merging, closing, and commenting on pull requests<br>- Integrates user authentication and interacts with underlying services to facilitate seamless pull request workflows, supporting collaboration and code review processes within the overall project architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- repositories Submodule -->
																	<details>
																		<summary><b>repositories</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.pr.repositories</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/repositories/PullRequestRepository.java'>PullRequestRepository.java</a></b></td>
																					<td style='padding: 8px;'>- Provides data access methods for managing pull request entities within the repository, enabling retrieval, existence checks, and maximum number calculations based on repository ID, status, and branch details<br>- Facilitates efficient querying and manipulation of pull request data, supporting the overall version control and collaboration workflows in the applications architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/repositories/PullRequestCommentRepository.java'>PullRequestCommentRepository.java</a></b></td>
																					<td style='padding: 8px;'>- Provides data access methods for pull request comments, enabling retrieval and counting of comments associated with specific pull requests<br>- Facilitates efficient querying of comment data, including fetching comments with author details and ordering by creation time, supporting features like comment display and analytics within the pull request review process.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.pr.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/PullRequestDetail.java'>PullRequestDetail.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a comprehensive data structure representing detailed information about pull requests within the system<br>- It encapsulates key attributes such as identifiers, status, authorship, branch details, timestamps, and review metrics, facilitating consistent data exchange and integration across the codebases pull request management and review workflows.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/UpdatePrCommentForm.java'>UpdatePrCommentForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for updating pull request comments within the project’s pull request management system<br>- It ensures that comment content adheres to validation rules, facilitating consistent and reliable comment modifications<br>- This component integrates into the broader architecture by supporting user interactions and maintaining data integrity during pull request review workflows.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/CreatePrCommentForm.java'>CreatePrCommentForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for creating pull request comments within the project’s PR review system<br>- Facilitates capturing comment content, associated file, commit, and line details, enabling precise and structured feedback during code review processes<br>- Integrates with backend validation to ensure comment data integrity, supporting seamless collaboration and review workflows in the overall architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/CreatePrForm.java'>CreatePrForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for creating pull requests within the project, encapsulating essential information such as title, description, source and target branches, and draft status<br>- Serves as a validation and transfer object to facilitate consistent and reliable PR creation workflows across the codebase, supporting seamless integration with backend processes.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/MergePrForm.java'>MergePrForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for merging pull requests, encapsulating the selected merge strategy and optional commit message<br>- Facilitates consistent handling of merge operations within the pull request processing workflow, ensuring that merge parameters are validated and correctly passed through the system<br>- Supports flexible merge strategies to align with project policies and developer preferences.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/PrCommentInfo.java'>PrCommentInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data structure representing pull request comments within the platform, capturing essential details such as author, content, associated file and line information, resolution status, and timestamps<br>- Facilitates consistent handling and transfer of comment data across the applications components, supporting features like review tracking, comment management, and collaboration within the code review process.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/PullRequestInfo.java'>PullRequestInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing comprehensive information about pull requests, including identifiers, status, authorship, branch details, timestamps, and merge data<br>- It facilitates structured communication of pull request metadata within the backend architecture, supporting features like PR tracking, reporting, and integration workflows in the overall codebase.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/MergeStrategy.java'>MergeStrategy.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the merge strategies available for pull request handling within the project, enabling flexible and consistent integration workflows<br>- It standardizes options such as merge commit, squash, and rebase, facilitating clear decision-making and automation in the pull request process across the codebase architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/dtos/UpdatePrForm.java'>UpdatePrForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for updating pull request details within the project<br>- Facilitates validation and transfer of user-provided information such as title, description, and draft status, ensuring consistent data handling across the applications PR management features<br>- Supports seamless updates to pull request metadata, contributing to efficient collaboration and version control workflows.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- entities Submodule -->
																	<details>
																		<summary><b>entities</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.pr.entities</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/entities/PullRequest.java'>PullRequest.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data model for pull requests within the platform, encapsulating key attributes such as repository association, status, authorship, branches, and timestamps<br>- Serves as a core component for managing and tracking pull request lifecycle events, integrating with repository and tenant entities to support collaborative code review and version control workflows in the overall architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/entities/PrStatus.java'>PrStatus.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the enumeration for pull request statuses within the project, categorizing pull requests as OPEN, MERGED, or CLOSED<br>- This facilitates consistent status management and tracking across the codebase, supporting the overall architecture of the backend system by enabling clear state representation and workflow control for pull request lifecycle handling.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/entities/PullRequestComment.java'>PullRequestComment.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data model for storing comments associated with pull requests within the project<br>- It captures details such as comment content, author, related file, line information, and resolution status, facilitating effective review workflows and collaboration in the code review process<br>- This entity integrates into the broader architecture by linking pull request discussions to user and code review activities.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.pr.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/pr/services/PullRequestService.java'>PullRequestService.java</a></b></td>
																					<td style='padding: 8px;'>- PullRequestService.javaThis class serves as the core component for managing pull request operations within the backend architecture<br>- It orchestrates the creation, retrieval, updating, merging, and commenting functionalities related to pull requests, facilitating seamless collaboration and code review processes<br>- By encapsulating the business logic for pull request lifecycle management, it ensures consistent handling of pull request data and interactions across the system, supporting the overall architectures goal of efficient and reliable version control workflows.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- repo Submodule -->
															<details>
																<summary><b>repo</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo</b></code>
																	<!-- mappers Submodule -->
																	<details>
																		<summary><b>mappers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.mappers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/mappers/RepoMapper.java'>RepoMapper.java</a></b></td>
																					<td style='padding: 8px;'>- Provides mapping functionalities to convert repository entities into data transfer objects, facilitating data exchange between the persistence layer and other application components<br>- It ensures seamless transformation of repository data, including owner information, supporting the overall architectures modularity and data consistency across the backend system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/controllers/RepoController.java'>RepoController.java</a></b></td>
																					<td style='padding: 8px;'>- Provides RESTful endpoints for managing repositories within the platform, enabling creation, retrieval, updating, and deletion of repository data<br>- Facilitates user-specific and collaborator-based repository operations, integrating authentication via JWT tokens to ensure secure access<br>- Serves as the primary interface for interacting with repository resources, supporting core CRUD functionalities aligned with the overall backend architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- listeners Submodule -->
																	<details>
																		<summary><b>listeners</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.listeners</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/listeners/RepoRenamedEventListener.java'>RepoRenamedEventListener.java</a></b></td>
																					<td style='padding: 8px;'>- Handles repository renaming events by coordinating updates between the storage provider and repository service<br>- Ensures that repository name changes are propagated to the storage layer after successful transactions and manages rollback procedures in case of IO exceptions, maintaining consistency within the overall architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/listeners/RepoCreatedEventListener.java'>RepoCreatedEventListener.java</a></b></td>
																					<td style='padding: 8px;'>- Handles repository lifecycle events by initiating repository setup after creation and cleaning up in case of IO errors<br>- Integrates with the repository service and storage provider to ensure proper initialization and error recovery, maintaining consistency and reliability within the overall architecture<br>- Facilitates seamless event-driven responses to repository-related actions.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- repositories Submodule -->
																	<details>
																		<summary><b>repositories</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.repositories</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/repositories/RepoRepository.java'>RepoRepository.java</a></b></td>
																					<td style='padding: 8px;'>- Provides data access methods for repository entities, enabling retrieval and management of repository records based on owner identifiers and names<br>- Facilitates efficient querying of repositories by owner ID, username, or repository name, supporting core backend operations related to repository management within the applications architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- service Submodule -->
																	<details>
																		<summary><b>service</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.service</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/service/GitProvider.java'>GitProvider.java</a></b></td>
																					<td style='padding: 8px;'>- Provides core functionalities for managing Git repositories within the platform, including initialization, opening, and renaming repositories on disk<br>- Facilitates seamless repository lifecycle operations, ensuring proper storage, access, and renaming workflows while integrating event-driven error handling to maintain system robustness<br>- Integral to the backend’s repository management architecture, supporting consistent and reliable version control operations.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/service/RepoService.java'>RepoService.java</a></b></td>
																					<td style='padding: 8px;'>- Manages repository lifecycle operations within the platform, including creation, retrieval, updating, and deletion of repositories<br>- Ensures proper authorization, maintains data consistency, and triggers relevant events for repository activities<br>- Integrates with tenant and collaborator data to support multi-tenant and collaborative workflows, serving as the core service layer for repository management in the architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/dtos/RepoInfo.java'>RepoInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a comprehensive data structure representing repository information within the backend architecture<br>- It encapsulates essential metadata such as ownership, naming, description, privacy status, topics, and timestamps, facilitating consistent data transfer and management across services<br>- This structure supports the overall systems goal of maintaining organized, accessible repository details for efficient operations and integrations.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/dtos/RepoForm.java'>RepoForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for repository creation and updates within the backend architecture<br>- It encapsulates repository attributes such as name, description, topics, and default branch, enforcing validation rules to ensure data integrity<br>- Serves as a key component for handling user input and maintaining consistent data structure across the repository management workflows.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/dtos/TenantRepoInfo.java'>TenantRepoInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing tenant repository information within the backend architecture<br>- It encapsulates essential tenant details such as unique identifier, username, and avatar URL, facilitating efficient data exchange and integration across different system components<br>- This structure supports the overall multi-tenant design by standardizing tenant data handling throughout the application.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- entities Submodule -->
																	<details>
																		<summary><b>entities</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.entities</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/entities/Repo.java'>Repo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the repository entity within the backend architecture, representing project repositories associated with tenants<br>- It encapsulates core attributes such as name, description, default branch, topics, and archival status, facilitating organized storage and retrieval of repository metadata<br>- Serves as a foundational component for managing repository data and relationships in the overall system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- events Submodule -->
																	<details>
																		<summary><b>events</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.repo.events</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/events/RepoCreatedEvent.java'>RepoCreatedEvent.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a record representing the event triggered upon the creation of a new repository, encapsulating essential details such as the repository owner and name<br>- It serves as a key component within the event-driven architecture of the backend, facilitating communication and processing related to repository creation activities across the system.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/events/RepoRenameIOExceptionOccurredEvent.java'>RepoRenameIOExceptionOccurredEvent.java</a></b></td>
																					<td style='padding: 8px;'>- Defines an event record signaling that an IOException occurred during a repository rename operation<br>- It facilitates communication within the event-driven architecture, enabling other components to respond appropriately to rename failures<br>- This enhances the systems robustness by providing clear, structured notifications about specific error conditions related to repository management.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/events/RepoIOExceptionOccurredEvent.java'>RepoIOExceptionOccurredEvent.java</a></b></td>
																					<td style='padding: 8px;'>- Defines an event record signaling an I/O exception occurrence within a repository, capturing the repository owner and name<br>- It facilitates event-driven handling of repository I/O errors, integrating into the broader architecture to enable responsive error management and monitoring in the backend system.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/repo/events/RepoRenamedEvent.java'>RepoRenamedEvent.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data structure representing a repository renaming event, capturing the repository owner, previous name, and new name<br>- Serves as a key component within the event-driven architecture to facilitate tracking and handling repository name changes across the system, ensuring consistent updates and notifications related to repository renaming activities.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- auth Submodule -->
															<details>
																<summary><b>auth</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.auth</b></code>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.auth.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/controllers/AuthController.java'>AuthController.java</a></b></td>
																					<td style='padding: 8px;'>- Provides RESTful endpoints for user authentication workflows, including login, registration, password recovery, email verification, and token refresh<br>- Facilitates secure user identity management and session handling within the overall architecture, enabling seamless integration of authentication processes across the application<br>- Acts as the primary interface for client interactions related to user authentication and account security.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- repositories Submodule -->
																	<details>
																		<summary><b>repositories</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.auth.repositories</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/repositories/AccountRepository.java'>AccountRepository.java</a></b></td>
																					<td style='padding: 8px;'>- Provides data access capabilities for user account entities within the authentication module, enabling efficient retrieval, storage, and management of account information<br>- Integrates with the overall architecture to support secure user authentication and authorization processes, serving as a foundational component for user identity management in the backend system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.auth.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/dtos/RecoveryCodeRequestForm.java'>RecoveryCodeRequestForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for capturing user identification details during password recovery processes within the authentication module<br>- It facilitates secure and validated input of usernames or emails, supporting the recovery workflow by ensuring proper data structure and validation before processing recovery requests in the broader authentication architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/dtos/RecoverPasswordForm.java'>RecoverPasswordForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for password recovery, encapsulating user input required to reset a password within the authentication flow<br>- Ensures validation of the new passwords complexity and the recovery codes integrity, facilitating secure and structured communication between client requests and backend password reset processes in the overall authentication architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/dtos/EmailVerificationForm.java'>EmailVerificationForm.java</a></b></td>
																					<td style='padding: 8px;'>- Facilitates email verification by encapsulating the verification code submitted by users<br>- Serves as a data transfer object within the authentication flow, enabling secure and structured validation of user email addresses<br>- Integrates into the broader authentication architecture to ensure users confirm their email addresses before gaining full access to the platform.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/dtos/RegistrationForm.java'>RegistrationForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for user registration, encapsulating essential validation rules for username, email, and password<br>- Facilitates secure and consistent capture of registration details within the authentication workflow, supporting user onboarding processes in the overall backend architecture<br>- Ensures input integrity and enforces security standards during account creation.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/dtos/AccountType.java'>AccountType.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the enumeration of supported third-party authentication providers, including Google, GitHub, and GitLab<br>- Facilitates clear identification and handling of different account types within the authentication process, ensuring consistent integration and management of external login options across the backend architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/dtos/RefreshTokenForm.java'>RefreshTokenForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for capturing refresh token information during authentication processes<br>- It facilitates secure token renewal by encapsulating the refresh token payload, supporting the overall authentication and session management architecture within the backend system<br>- This structure ensures consistent handling of refresh tokens across authentication workflows.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/dtos/LoginForm.java'>LoginForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the structure for user login data, enabling secure and validated authentication requests within the backend architecture<br>- It ensures that user credentials, whether username or email, along with passwords, adhere to specified validation rules, facilitating reliable login processes and maintaining data integrity across the authentication flow.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- entities Submodule -->
																	<details>
																		<summary><b>entities</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.auth.entities</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/entities/Account.java'>Account.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the Account entity within the authentication module, representing user accounts across tenants<br>- It manages core account attributes such as account type, identifiers, contact details, and creation timestamp, while establishing relationships with tenant data<br>- Serves as a foundational component for user management and access control within the overall system architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.auth.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/auth/services/AuthService.java'>AuthService.java</a></b></td>
																					<td style='padding: 8px;'>- Provides core authentication functionalities including user registration, login, email verification, and password recovery within the backend architecture<br>- Manages tenant data, generates JWT tokens for session management, and ensures secure handling of credentials, supporting seamless user onboarding and account security across the platform.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- shared Submodule -->
															<details>
																<summary><b>shared</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared</b></code>
																	<!-- errorhandling Submodule -->
																	<details>
																		<summary><b>errorhandling</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.errorhandling</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/errorhandling/ErrorHandler.java'>ErrorHandler.java</a></b></td>
																					<td style='padding: 8px;'>- Provides centralized error handling for the backend, ensuring consistent and meaningful HTTP responses across the application<br>- Manages various exception types, including validation errors, resource not found, and unauthorized access, while logging relevant details<br>- Enhances robustness and user experience by translating internal exceptions into appropriate client-facing responses within the overall architecture.</td>
																				</tr>
																			</table>
																			<!-- exceptions Submodule -->
																			<details>
																				<summary><b>exceptions</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.errorhandling.exceptions</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/errorhandling/exceptions/BadRequestException.java'>BadRequestException.java</a></b></td>
																							<td style='padding: 8px;'>- Defines a custom exception for handling client-side errors related to invalid requests within the backend architecture<br>- It facilitates clear error signaling and consistent response management across the application, supporting robust error handling and improving overall system reliability<br>- This exception integrates into the broader error management strategy, ensuring meaningful feedback for bad request scenarios.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/errorhandling/exceptions/ErrorOccurredException.java'>ErrorOccurredException.java</a></b></td>
																							<td style='padding: 8px;'>- Defines a custom runtime exception to signal unexpected errors within the application<br>- It facilitates consistent error handling and propagation across the backend, ensuring that unforeseen issues are captured and managed effectively, thereby supporting the overall robustness and maintainability of the system architecture.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/errorhandling/exceptions/TokenExpiredException.java'>TokenExpiredException.java</a></b></td>
																							<td style='padding: 8px;'>Defines a custom exception to signal expired authentication tokens within the applications error handling framework, facilitating precise control over token lifecycle management and enhancing security protocols across the backend architecture.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/errorhandling/exceptions/AccessNotAllowedException.java'>AccessNotAllowedException.java</a></b></td>
																							<td style='padding: 8px;'>- Defines a custom runtime exception to handle unauthorized access attempts within the backend system<br>- It integrates into the overall error handling architecture, enabling consistent management of access control violations across the application<br>- This exception supports clear, maintainable security enforcement and improves error reporting related to permission issues.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/errorhandling/exceptions/ItemNotFoundException.java'>ItemNotFoundException.java</a></b></td>
																							<td style='padding: 8px;'>- Defines a custom runtime exception to signal when a requested item is not found within the application<br>- It enhances error handling by providing a clear, specific mechanism for indicating missing resources, supporting consistent exception management across the backend architecture<br>- This exception integrates into the broader error handling strategy, facilitating precise control flow and user feedback.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/errorhandling/exceptions/ItemAlreadyExistsException.java'>ItemAlreadyExistsException.java</a></b></td>
																							<td style='padding: 8px;'>- Defines a custom runtime exception to signal attempts to create duplicate items within the application<br>- It enhances error handling by providing a clear, specific mechanism for identifying and managing cases where an item already exists, supporting robust validation and user feedback in the overall backend architecture.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																	<!-- security Submodule -->
																	<details>
																		<summary><b>security</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.security</b></code>
																			<!-- configs Submodule -->
																			<details>
																				<summary><b>configs</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.security.configs</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/security/configs/CustomAuthenticationEntryPoint.java'>CustomAuthenticationEntryPoint.java</a></b></td>
																							<td style='padding: 8px;'>- Handles unauthorized access attempts by intercepting authentication failures and returning structured JSON error responses<br>- Integrates with Spring Security to ensure consistent, informative feedback when users attempt to access protected resources without proper authentication, thereby enhancing security and user experience within the overall backend architecture.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/security/configs/JwtAuthenticationFilter.java'>JwtAuthenticationFilter.java</a></b></td>
																							<td style='padding: 8px;'>- Implements JWT-based authentication by validating tokens and establishing user identity within the security context<br>- It ensures secure access control across the applications endpoints by verifying incoming requests authorization headers and associating authenticated user details with the security framework<br>- This filter integrates seamlessly into the overall security architecture, enabling consistent and reliable user authentication throughout the system.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/security/configs/SecurityConfig.java'>SecurityConfig.java</a></b></td>
																							<td style='padding: 8px;'>- Defines security configurations for the backend, establishing authentication and authorization policies<br>- Implements stateless session management, integrates OAuth2 login, JWT authentication, and CORS settings<br>- Ensures protected endpoints require authentication while permitting access to public and health check routes, thereby securing the applications API surface within the overall architecture.</td>
																						</tr>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/security/configs/CustomOauth2SuccessHandler.java'>CustomOauth2SuccessHandler.java</a></b></td>
																							<td style='padding: 8px;'>- Handles OAuth2 authentication success events by generating JWT tokens, creating or retrieving tenant and account records, and redirecting users to the frontend with authentication tokens<br>- Integrates multiple OAuth providers, ensuring seamless user onboarding and secure session management within the overall architecture of user identity and access control.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																	<!-- tenant Submodule -->
																	<details>
																		<summary><b>tenant</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.tenant</b></code>
																			<!-- repositories Submodule -->
																			<details>
																				<summary><b>repositories</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.tenant.repositories</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/tenant/repositories/TenantRepository.java'>TenantRepository.java</a></b></td>
																							<td style='padding: 8px;'>- Provides data access operations for tenant entities within the application, enabling retrieval, updates, and existence checks based on identifiers such as username, email, and recovery codes<br>- Facilitates core tenant management functionalities like login tracking, account verification, and password recovery, integrating seamlessly into the overall architecture to support multi-tenant user management and authentication workflows.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																			<!-- entities Submodule -->
																			<details>
																				<summary><b>entities</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.tenant.entities</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/tenant/entities/Tenant.java'>Tenant.java</a></b></td>
																							<td style='padding: 8px;'>- Defines the Tenant entity within the backend architecture, representing individual user or client profiles in the multi-tenant system<br>- Facilitates storage and management of tenant-specific data such as credentials, contact information, and metadata, supporting core functionalities like authentication, authorization, and user management across the platform<br>- Serves as a foundational component for tenant isolation and data integrity.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																	<!-- auth Submodule -->
																	<details>
																		<summary><b>auth</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.auth</b></code>
																			<!-- utils Submodule -->
																			<details>
																				<summary><b>utils</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.auth.utils</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/auth/utils/BearerTokenUtils.java'>BearerTokenUtils.java</a></b></td>
																							<td style='padding: 8px;'>- Provides utility functions for handling Bearer tokens within the authentication framework, enabling validation and extraction of JWT tokens from authorization headers<br>- Supports secure and consistent token processing across the backend, ensuring proper identification and validation of user sessions in the overall authentication architecture.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																			<!-- dtos Submodule -->
																			<details>
																				<summary><b>dtos</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.auth.dtos</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/auth/dtos/LoginInfo.java'>LoginInfo.java</a></b></td>
																							<td style='padding: 8px;'>- Defines a data transfer object encapsulating user login details, including email, username, access token, and refresh token<br>- Facilitates secure and structured communication of authentication information across different components of the backend architecture, supporting user login workflows and token management within the overall authentication system.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																			<!-- services Submodule -->
																			<details>
																				<summary><b>services</b></summary>
																				<blockquote>
																					<div class='directory-path' style='padding: 8px 0; color: #666;'>
																						<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.shared.auth.services</b></code>
																					<table style='width: 100%; border-collapse: collapse;'>
																					<thead>
																						<tr style='background-color: #f8f9fa;'>
																							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																							<th style='text-align: left; padding: 8px;'>Summary</th>
																						</tr>
																					</thead>
																						<tr style='border-bottom: 1px solid #eee;'>
																							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/shared/auth/services/JwtUtils.java'>JwtUtils.java</a></b></td>
																							<td style='padding: 8px;'>- Provides utility functions for generating, parsing, and validating JSON Web Tokens (JWTs) within the authentication framework<br>- Facilitates secure user identification and session management by creating access and refresh tokens, extracting user information, and ensuring token integrity across the applications security architecture.</td>
																						</tr>
																					</table>
																				</blockquote>
																			</details>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- commit Submodule -->
															<details>
																<summary><b>commit</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.commit</b></code>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.commit.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/controllers/CommitController.java'>CommitController.java</a></b></td>
																					<td style='padding: 8px;'>- Provides REST API endpoints for retrieving commit data within the project architecture<br>- Facilitates fetching commit lists, detailed commit information, and diffs for specific commits, enabling seamless integration of version control insights into the broader system<br>- Serves as a key interface layer connecting client requests to underlying commit services in the backend.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.commit.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/CommitInfo.java'>CommitInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object encapsulating comprehensive commit details within the backend architecture<br>- It facilitates structured communication of commit metadata, including identifiers, messages, author information, timestamps, parent commits, and associated statistics, supporting efficient data handling and integration across components involved in version control and repository management.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/PagedResult.java'>PagedResult.java</a></b></td>
																					<td style='padding: 8px;'>- Provides a generic structure for paginated data responses within the backend, facilitating efficient data retrieval and navigation across large datasets<br>- It encapsulates essential pagination details such as current page, total items, total pages, and navigation flags, supporting consistent and streamlined data handling across various components of the application.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/DiffHunk.java'>DiffHunk.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data structure representing a specific segment of code differences, known as a diff hunk, within the version control system<br>- It encapsulates details about line ranges and content changes, facilitating precise tracking and display of code modifications<br>- This structure supports the broader architecture of change management, review, and visualization in the project’s code review and versioning processes.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/LineType.java'>LineType.java</a></b></td>
																					<td style='padding: 8px;'>- Defines an enumeration representing the types of lines in a commit diff, categorizing them as additions, deletions, or context lines<br>- This classification facilitates accurate parsing and processing of code changes within the version control system, supporting features like diff visualization, change tracking, and review workflows in the overall architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/AuthorInfo.java'>AuthorInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing author information within the commit context, encapsulating key attributes such as name, email, username, and avatar URL<br>- Facilitates consistent and efficient handling of author details across the backend architecture, supporting features like commit attribution, user profiles, and integration with external systems.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/DiffLine.java'>DiffLine.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data structure representing individual lines within a code diff, capturing line type, original and new line numbers, and content<br>- Facilitates precise tracking and comparison of code changes across different versions, supporting the projects version control and code review functionalities within the overall architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/CommitStats.java'>CommitStats.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object encapsulating commit statistics, including the number of additions, deletions, and files changed<br>- It facilitates efficient communication of commit impact data within the backend architecture, supporting features such as analytics, reporting, or change tracking in the overall version control management system.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/FileDiff.java'>FileDiff.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing detailed differences between file versions within the version control system<br>- It encapsulates file paths, change types, line modifications, and diff hunks, facilitating precise tracking and analysis of code changes across the projects architecture<br>- This structure supports features like code review, change visualization, and version comparison in the backend.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/dtos/CommitDetail.java'>CommitDetail.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a comprehensive data structure representing detailed information about a specific commit within the version control history<br>- It encapsulates essential commit attributes such as identifiers, messages, author details, timestamps, parent commits, statistics, and associated file changes, facilitating seamless data transfer and integration across components of the backend architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.commit.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/commit/services/CommitService.java'>CommitService.java</a></b></td>
																					<td style='padding: 8px;'>- Provides core services for retrieving and analyzing commit data within the version control system<br>- Facilitates fetching commit histories, detailed commit information, and file diffs, including change statistics and author resolution, supporting comprehensive insights into repository activity and history management.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- collaborator Submodule -->
															<details>
																<summary><b>collaborator</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.collaborator</b></code>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.collaborator.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/controllers/CollaboratorController.java'>CollaboratorController.java</a></b></td>
																					<td style='padding: 8px;'>- Defines RESTful endpoints for managing repository collaborators within the backend architecture<br>- Facilitates retrieving, adding, updating, and removing collaborators for specific repositories, integrating with the collaborator transaction service to ensure data consistency and integrity across the platform<br>- Serves as a key interface connecting client requests to core collaborator management functionalities in the system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- repositories Submodule -->
																	<details>
																		<summary><b>repositories</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.collaborator.repositories</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/repositories/CollaboratorRepository.java'>CollaboratorRepository.java</a></b></td>
																					<td style='padding: 8px;'>- Provides data access methods for managing Collaborator entities within the backend architecture, enabling retrieval, existence checks, and associations between collaborators, repositories, and tenants<br>- Facilitates efficient querying of collaborator relationships, supporting core functionalities related to access control and collaboration management across repositories and tenants in the system.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.collaborator.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/dtos/AddCollaboratorForm.java'>AddCollaboratorForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data structure for adding collaborators, encapsulating user identification and permission levels<br>- It facilitates the process of assigning roles within the project’s collaboration framework, ensuring proper validation and standardization of input data<br>- This component supports the broader architecture by enabling controlled access management and fostering secure, organized team collaboration.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/dtos/UpdateCollaboratorForm.java'>UpdateCollaboratorForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for updating collaborator permissions within the backend architecture, facilitating controlled access management<br>- It enforces validation rules to ensure only valid permission levels—READ, WRITE, or ADMIN—are assigned, supporting secure and consistent role updates across the collaborative platform<br>- This component integrates into the broader system to streamline permission modifications and uphold access integrity.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/dtos/CollaboratorInfo.java'>CollaboratorInfo.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object encapsulating collaborator details within the backend architecture<br>- It standardizes the representation of collaborator information, including identifiers, display attributes, permissions, and creation timestamp, facilitating consistent data exchange and integration across different system components in the project.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- entities Submodule -->
																	<details>
																		<summary><b>entities</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.collaborator.entities</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/entities/CollaboratorId.java'>CollaboratorId.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a composite identifier for collaborator entities by encapsulating repository and tenant UUIDs<br>- Facilitates unique identification and efficient management of collaborator relationships within the backend architecture, supporting data integrity and relational mappings in the overall system.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/entities/Collaborator.java'>Collaborator.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the Collaborator entity representing the association between repositories and tenants within the platform<br>- It manages collaborator details, including permissions and creation timestamps, facilitating access control and collaboration management across multiple repositories and tenants in the overall architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.collaborator.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/services/RepoPermissionService.java'>RepoPermissionService.java</a></b></td>
																					<td style='padding: 8px;'>- Provides core functionality for verifying user permissions on repositories, ensuring appropriate access levels for owners and collaborators<br>- Facilitates security and access control within the platform by determining if users have at least read, write, or admin rights, thereby supporting the overall architecture of secure, role-based repository management.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/collaborator/services/CollaboratorTxService.java'>CollaboratorTxService.java</a></b></td>
																					<td style='padding: 8px;'>- Manages collaborator relationships within repositories by enabling retrieval, addition, updating, and removal of collaborators<br>- Ensures data integrity through validation and transactional operations, facilitating seamless collaboration management aligned with project architecture<br>- Supports core functionality for maintaining accurate access control and user permissions across repositories in the platform.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
															<!-- user Submodule -->
															<details>
																<summary><b>user</b></summary>
																<blockquote>
																	<div class='directory-path' style='padding: 8px 0; color: #666;'>
																		<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.user</b></code>
																	<!-- controllers Submodule -->
																	<details>
																		<summary><b>controllers</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.user.controllers</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/controllers/UserSearchController.java'>UserSearchController.java</a></b></td>
																					<td style='padding: 8px;'>- Facilitates user profile management and search functionalities within the application<br>- Handles retrieval and updates of current user details, password changes, account deletion, and access to public profiles<br>- Also enables searching for users by username or query, supporting core user discovery and profile interaction features integral to the platforms architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- dtos Submodule -->
																	<details>
																		<summary><b>dtos</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.user.dtos</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/dtos/UserPublicProfileDto.java'>UserPublicProfileDto.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing a users public profile information, including username, display name, and avatar URL<br>- Facilitates secure and efficient sharing of user identity details across different system components, supporting features like profile display and user discovery within the overall backend architecture<br>- Ensures consistent data structure for user profile data exchange.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/dtos/UserSearchResult.java'>UserSearchResult.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing user search results within the backend architecture<br>- It encapsulates key user attributes such as username, display name, and avatar URL, facilitating efficient data exchange and presentation in user search functionalities across the system<br>- This structure supports seamless integration and consistent data handling in the overall application flow.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/dtos/ChangePasswordForm.java'>ChangePasswordForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for capturing user input when changing passwords, ensuring validation of current and new passwords<br>- Integrates into the user management module to facilitate secure password updates, supporting the overall authentication and security architecture of the application<br>- This component enables seamless and validated password change operations within the user account management flow.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/dtos/UpdateUsernameForm.java'>UpdateUsernameForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines the data transfer object for updating user usernames within the user management module<br>- It enforces validation rules to ensure usernames are non-blank, appropriately sized, and conform to allowed character patterns<br>- This structure facilitates secure and consistent username updates across the applications user profile management system.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/dtos/UserMeDto.java'>UserMeDto.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object representing the authenticated users profile information within the overall user management architecture<br>- Facilitates secure and structured communication of user details such as identity, contact info, and roles across system components, supporting personalized experiences and authorization processes in the backend infrastructure.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/dtos/UpdateDisplayNameForm.java'>UpdateDisplayNameForm.java</a></b></td>
																					<td style='padding: 8px;'>- Defines a data transfer object for updating user display names within the backend architecture<br>- It facilitates validation and encapsulation of user input, enabling seamless and secure updates to user profiles<br>- This component integrates into the user management flow, supporting consistent data handling across the system’s user-related operations.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																	<!-- services Submodule -->
																	<details>
																		<summary><b>services</b></summary>
																		<blockquote>
																			<div class='directory-path' style='padding: 8px 0; color: #666;'>
																				<code><b>⦿ originhub-backend.src.main.java.com.nuricanozturk.originhub.user.services</b></code>
																			<table style='width: 100%; border-collapse: collapse;'>
																			<thead>
																				<tr style='background-color: #f8f9fa;'>
																					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																					<th style='text-align: left; padding: 8px;'>Summary</th>
																				</tr>
																			</thead>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/services/UserMeService.java'>UserMeService.java</a></b></td>
																					<td style='padding: 8px;'>- Provides user-centric services for retrieving, updating, and managing tenant profiles within the application<br>- Facilitates fetching current user details, viewing public profiles, updating usernames and display names, changing passwords, and deleting accounts, ensuring seamless user account management aligned with the overall architecture.</td>
																				</tr>
																				<tr style='border-bottom: 1px solid #eee;'>
																					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/main/java/com/nuricanozturk/originhub/user/services/UserSearchService.java'>UserSearchService.java</a></b></td>
																					<td style='padding: 8px;'>- Facilitates user search functionality within the application by retrieving and transforming tenant data based on username prefixes<br>- It enables efficient, case-insensitive lookup of user profiles, supporting features like user autocomplete or directory browsing, and integrates seamlessly into the broader user management architecture.</td>
																				</tr>
																			</table>
																		</blockquote>
																	</details>
																</blockquote>
															</details>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
					<!-- test Submodule -->
					<details>
						<summary><b>test</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ originhub-backend.src.test</b></code>
							<!-- java Submodule -->
							<details>
								<summary><b>java</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-backend.src.test.java</b></code>
									<!-- com Submodule -->
									<details>
										<summary><b>com</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-backend.src.test.java.com</b></code>
											<!-- nuricanozturk Submodule -->
											<details>
												<summary><b>nuricanozturk</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-backend.src.test.java.com.nuricanozturk</b></code>
													<!-- originhub Submodule -->
													<details>
														<summary><b>originhub</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ originhub-backend.src.test.java.com.nuricanozturk.originhub</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-backend/src/test/java/com/nuricanozturk/originhub/OriginHubApplicationTests.java'>OriginHubApplicationTests.java</a></b></td>
																	<td style='padding: 8px;'>- Validates the applications context loading within the overall backend architecture, ensuring that the Spring Boot environment initializes correctly<br>- Serves as a foundational health check to confirm that core dependencies and configurations are properly set up, supporting reliable startup and integration testing for the entire project.</td>
																</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
	<!-- config Submodule -->
	<details>
		<summary><b>config</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ config</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/config/checkstyle.xml'>checkstyle.xml</a></b></td>
					<td style='padding: 8px;'>- Defines coding standards and quality checks to ensure consistent, maintainable, and high-quality Java code across the project<br>- Enforces best practices, style guidelines, and static analysis rules, contributing to the overall robustness and readability of the codebase architecture<br>- This configuration supports automated code review processes and helps prevent common coding issues.</td>
				</tr>
			</table>
		</blockquote>
	</details>
	<!-- originhub-frontend Submodule -->
	<details>
		<summary><b>originhub-frontend</b></summary>
		<blockquote>
			<div class='directory-path' style='padding: 8px 0; color: #666;'>
				<code><b>⦿ originhub-frontend</b></code>
			<table style='width: 100%; border-collapse: collapse;'>
			<thead>
				<tr style='background-color: #f8f9fa;'>
					<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
					<th style='text-align: left; padding: 8px;'>Summary</th>
				</tr>
			</thead>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/angular.json'>angular.json</a></b></td>
					<td style='padding: 8px;'>- Defines the project configuration for the Angular-based frontend application, orchestrating build, serve, and lint processes<br>- It ensures consistent development and production workflows, manages assets and styles, and streamlines project scaffolding within the overall architecture<br>- This setup facilitates efficient development, deployment, and maintenance of the user interface layer.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/pnpm-lock.yaml'>pnpm-lock.yaml</a></b></td>
					<td style='padding: 8px;'>- Overview of <code>pnpm-lock.yaml</code> in <code>originhub-frontend</code>This <code>pnpm-lock.yaml</code> file serves as the definitive dependency lockfile for the <code>originhub-frontend</code> project, ensuring consistent and reproducible package installations across development environments<br>- It captures the exact versions of all dependencies and their transitive dependencies, facilitating reliable builds and minimizing discrepancies caused by version mismatches.Within the broader architecture, this lockfile supports the frontend applications stability and integrity by maintaining a precise dependency tree aligned with the Angular framework (version 21.2.0) and associated libraries<br>- This consistency is crucial for the application's performance, security, and compatibility, enabling seamless development, testing, and deployment workflows across the project.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/tsconfig.app.json'>tsconfig.app.json</a></b></td>
					<td style='padding: 8px;'>- Defines the TypeScript compilation settings specific to the applications source code, ensuring proper build output and type management within the Angular project<br>- It integrates with the overall project configuration to facilitate efficient development and accurate type checking, supporting the architectures goal of maintaining a scalable and maintainable frontend codebase.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/.prettierrc'>.prettierrc</a></b></td>
					<td style='padding: 8px;'>- Defines formatting standards for the frontend project, ensuring consistent code style across the codebase<br>- By configuring rules for quotes, trailing commas, line width, and plugin integrations, it promotes uniformity and readability, facilitating seamless collaboration and maintainability within the overall architecture of the originhub-frontend application.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/.editorconfig'>.editorconfig</a></b></td>
					<td style='padding: 8px;'>- Defines consistent coding standards and formatting rules across the frontend project, ensuring uniformity and readability in TypeScript, Markdown, and other files<br>- Supports seamless collaboration by maintaining a shared editor configuration, which aligns development practices with project conventions and enhances overall code quality within the architecture.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/README.md'>README.md</a></b></td>
					<td style='padding: 8px;'>- Provides the foundational structure and configuration for the OriginHub frontend application built with Angular<br>- It orchestrates the overall architecture, enabling development, testing, and deployment workflows, and ensures seamless integration of components, services, and modules to deliver a responsive, scalable user interface for the platform.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/vercel.json'>vercel.json</a></b></td>
					<td style='padding: 8px;'>- Defines deployment and build configurations for the frontend application, specifying the build command, output directory, and URL rewriting rules<br>- Ensures seamless deployment by directing all non-asset routes to the main HTML file, supporting client-side routing within the overall architecture of the originhub-frontend project.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/eslint.config.js'>eslint.config.js</a></b></td>
					<td style='padding: 8px;'>- Defines and enforces coding standards and best practices for TypeScript and Angular templates within the frontend project<br>- Ensures consistent, maintainable, and accessible code by applying recommended linting rules, style guidelines, and Angular-specific conventions across the codebase, supporting overall code quality and development efficiency.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/set-env.js'>set-env.js</a></b></td>
					<td style='padding: 8px;'>- Defines environment-specific configuration for the frontend application by dynamically generating a TypeScript environment file<br>- It ensures that API endpoints and repository URLs are correctly set based on deployment context, facilitating seamless environment management across development, staging, and production<br>- This setup supports the overall architecture by enabling flexible, environment-aware behavior in the client-side codebase.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/package.json'>package.json</a></b></td>
					<td style='padding: 8px;'>- Defines the frontend applications project configuration, including dependencies, scripts, and environment settings, enabling consistent development, building, and deployment processes within the overall architecture<br>- It ensures the Angular-based interface integrates seamlessly with backend services and supports development workflows aligned with project standards.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/.cursorrules'>.cursorrules</a></b></td>
					<td style='padding: 8px;'>- Cursorrules` File SummaryThis configuration file defines the cursor behavior and styling rules for the OriginHub Frontend application<br>- It ensures a consistent and intuitive cursor experience across the user interface, aligning with the projects overall design and interaction standards<br>- By standardizing cursor interactions, this file contributes to a cohesive user experience within the Angular-based architecture, supporting smooth navigation and usability throughout the application.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/tsconfig.json'>tsconfig.json</a></b></td>
					<td style='padding: 8px;'>- Defines TypeScript compilation settings to ensure consistent, optimized builds of the frontend application<br>- It configures module resolution, output directories, and strict Angular compiler options, supporting maintainability and performance within the overall architecture<br>- This setup facilitates seamless development and deployment of the Angular-based user interface in the originhub project.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/tsconfig.spec.json'>tsconfig.spec.json</a></b></td>
					<td style='padding: 8px;'>- Defines TypeScript configuration for testing, ensuring that specifications and type declaration files are correctly compiled within the Angular project<br>- It integrates Jasmine testing framework types and directs output to a dedicated directory, supporting reliable and isolated test execution aligned with the overall codebase architecture.</td>
				</tr>
				<tr style='border-bottom: 1px solid #eee;'>
					<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/.postcssrc.json'>.postcssrc.json</a></b></td>
					<td style='padding: 8px;'>- Configures PostCSS to integrate Tailwind CSS styles into the frontend build process, ensuring consistent and efficient styling across the application<br>- It plays a crucial role in the overall architecture by enabling utility-first CSS management, which supports scalable and maintainable UI development within the originhub-frontend project.</td>
				</tr>
			</table>
			<!-- src Submodule -->
			<details>
				<summary><b>src</b></summary>
				<blockquote>
					<div class='directory-path' style='padding: 8px 0; color: #666;'>
						<code><b>⦿ originhub-frontend.src</b></code>
					<table style='width: 100%; border-collapse: collapse;'>
					<thead>
						<tr style='background-color: #f8f9fa;'>
							<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
							<th style='text-align: left; padding: 8px;'>Summary</th>
						</tr>
					</thead>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/main.ts'>main.ts</a></b></td>
							<td style='padding: 8px;'>- Initialize the Angular application by bootstrapping the main App component with the specified configuration, establishing the entry point for the frontend<br>- This setup ensures the application is properly launched and configured, serving as the foundation for the user interface and overall client-side architecture within the project.</td>
						</tr>
						<tr style='border-bottom: 1px solid #eee;'>
							<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/index.html'>index.html</a></b></td>
							<td style='padding: 8px;'>- Defines the foundational HTML structure for the OriginHub frontend application, establishing the main entry point and loading essential resources<br>- It sets up the environment for a self-hosted Git interface, ensuring proper rendering, theming, and font loading to support the user interface and overall architecture.</td>
						</tr>
					</table>
					<!-- environments Submodule -->
					<details>
						<summary><b>environments</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ originhub-frontend.src.environments</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/environments/environment.ts'>environment.ts</a></b></td>
									<td style='padding: 8px;'>- Defines environment-specific configurations for the frontend application, specifying API and Git repository URLs used during development<br>- Facilitates seamless switching between different deployment environments by centralizing key endpoints, ensuring consistent connectivity and integration points across the codebase<br>- Supports flexible environment management, enabling efficient development and testing workflows within the project architecture.</td>
								</tr>
							</table>
						</blockquote>
					</details>
					<!-- app Submodule -->
					<details>
						<summary><b>app</b></summary>
						<blockquote>
							<div class='directory-path' style='padding: 8px 0; color: #666;'>
								<code><b>⦿ originhub-frontend.src.app</b></code>
							<table style='width: 100%; border-collapse: collapse;'>
							<thead>
								<tr style='background-color: #f8f9fa;'>
									<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
									<th style='text-align: left; padding: 8px;'>Summary</th>
								</tr>
							</thead>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/lucide-icons.ts'>lucide-icons.ts</a></b></td>
									<td style='padding: 8px;'>- Provides a centralized collection of Lucide icon components for consistent use across the frontend application<br>- Facilitates easy icon management and integration within the project’s UI, ensuring visual coherence and streamlined development by exporting a comprehensive set of icons from the lucide-angular library<br>- Supports the overall architecture by promoting reusable, maintainable, and scalable icon usage throughout the codebase.</td>
								</tr>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/app.config.ts'>app.config.ts</a></b></td>
									<td style='padding: 8px;'>- Defines the core application configuration for the frontend, establishing essential services such as routing, HTTP client with interceptors, icon provisioning, and global error handling<br>- Facilitates seamless integration of navigation, API communication, and error management, ensuring a robust foundation for the applications architecture and overall user experience.</td>
								</tr>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/app.html'>app.html</a></b></td>
									<td style='padding: 8px;'>- Defines the main layout structure of the application, orchestrating core UI components such as navigation, footer, modals, and toast notifications<br>- It establishes the overall page framework, enabling seamless integration of dynamic content via routing, and ensures a consistent user interface across the entire frontend architecture.</td>
								</tr>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/app.routes.ts'>app.routes.ts</a></b></td>
									<td style='padding: 8px;'>- Defines the applications routing architecture, orchestrating navigation across core features such as landing, authentication, user profiles, and repository management<br>- Implements route guards for access control and dynamically loads components to facilitate seamless user experiences within the project’s modular structure<br>- Serves as the central map guiding user flow and feature accessibility throughout the platform.</td>
								</tr>
								<tr style='border-bottom: 1px solid #eee;'>
									<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/app.ts'>app.ts</a></b></td>
									<td style='padding: 8px;'>- Establishes the root component of the application, orchestrating the core layout and navigation structure<br>- It integrates essential UI elements such as the navbar, footer, modals, and toast notifications, serving as the foundational scaffold that enables seamless user interaction and consistent layout across the entire frontend architecture.</td>
								</tr>
							</table>
							<!-- core Submodule -->
							<details>
								<summary><b>core</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-frontend.src.app.core</b></code>
									<!-- toast Submodule -->
									<details>
										<summary><b>toast</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.toast</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/toast/toast-host.component.ts'>toast-host.component.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a centralized container for displaying toast notifications within the application<br>- It manages rendering active toasts, ensuring user alerts are visible and dismissible, thereby enhancing user experience through consistent and organized notification handling across the frontend architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/toast/toast.service.ts'>toast.service.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a centralized service for managing toast notifications within the application, enabling the display of success and error messages<br>- Facilitates adding, dismissing, and automatically removing notifications after a specified duration, thereby enhancing user feedback and interaction consistency across the frontend architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- gravatar Submodule -->
									<details>
										<summary><b>gravatar</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.gravatar</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/gravatar/gravatar.util.ts'>gravatar.util.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a utility function to generate Gravatar URLs based on user email or username, ensuring consistent avatar display across the application<br>- It prioritizes custom avatar URLs when available and defaults to Gravatar with an identicon if not<br>- This supports a unified user profile experience by seamlessly integrating avatar images within the overall frontend architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- confirm-modal Submodule -->
									<details>
										<summary><b>confirm-modal</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.confirm-modal</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/confirm-modal/confirm-modal-host.component.ts'>confirm-modal-host.component.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a dedicated container for rendering confirmation modals within the application<br>- It manages modal visibility, content, and user interactions by integrating with the ConfirmModalService, ensuring consistent and centralized handling of confirmation dialogs across the user interface<br>- This component enhances user experience by streamlining modal display logic and maintaining a cohesive modal presentation architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/confirm-modal/confirm-modal.service.ts'>confirm-modal.service.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a service to display customizable confirmation modals, enabling users to prompt for and handle user confirmation actions within the application<br>- Facilitates asynchronous confirmation workflows by returning promises that resolve based on user interaction, thereby integrating user decision points seamlessly into the overall application flow.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- ssh Submodule -->
									<details>
										<summary><b>ssh</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.ssh</b></code>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.ssh.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/ssh/services/ssh-key.service.ts'>ssh-key.service.ts</a></b></td>
															<td style='padding: 8px;'>- Manages user SSH keys within the application by providing functionalities to list, add, and delete SSH keys through API interactions<br>- Facilitates secure key management, enabling users to seamlessly update their SSH credentials, which supports authentication workflows and enhances overall security posture in the system architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- branch Submodule -->
									<details>
										<summary><b>branch</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.branch</b></code>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.branch.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/branch/services/branch.service.ts'>branch.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides core branch management functionalities within the frontend architecture, enabling retrieval, creation, deletion, and default setting of repository branches through API interactions<br>- Facilitates seamless integration with backend services to support version control operations, ensuring consistent branch handling across the application’s user interface and maintaining alignment with the overall project structure.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- pull-request Submodule -->
									<details>
										<summary><b>pull-request</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.pull-request</b></code>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.pull-request.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/pull-request/services/pull-request.service.ts'>pull-request.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides core services for managing pull requests within the application architecture, enabling creation, retrieval, updating, merging, and commenting on pull requests through API interactions<br>- Facilitates seamless integration with version control workflows, supporting efficient pull request lifecycle management and collaboration in the frontend module.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- repo Submodule -->
									<details>
										<summary><b>repo</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.repo</b></code>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.repo.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/repo/services/repo-context.service.ts'>repo-context.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides centralized management of repository context within the application, enabling consistent access to repository information and default branch details across components<br>- Facilitates seamless data sharing and reactivity related to repository state, supporting the overall architectures goal of maintaining a cohesive and responsive user experience in the frontend.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/repo/services/repo.service.ts'>repo.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides core repository management functionalities within the application, enabling creation, retrieval, updating, listing, and deletion of repositories through API interactions<br>- Integrates seamlessly with backend services to facilitate repository operations, supporting user-specific and collaborator repositories, thereby underpinning the projects data handling and collaboration features related to code repositories.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- auth Submodule -->
									<details>
										<summary><b>auth</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.auth</b></code>
											<!-- interceptors Submodule -->
											<details>
												<summary><b>interceptors</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.auth.interceptors</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/auth/interceptors/auth.interceptor.ts'>auth.interceptor.ts</a></b></td>
															<td style='padding: 8px;'>- Implements an HTTP interceptor that automatically appends authentication tokens to outgoing requests, ensuring secure communication with backend services<br>- Integrates seamlessly within the Angular applications core authentication architecture, facilitating consistent and streamlined authorization across the frontend<br>- This component is essential for maintaining secure API interactions and supporting user authentication workflows within the overall project structure.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/auth/interceptors/refresh.interceptor.ts'>refresh.interceptor.ts</a></b></td>
															<td style='padding: 8px;'>- Implements an HTTP interceptor to handle token expiration by automatically refreshing authentication tokens upon receiving unauthorized responses<br>- Ensures seamless user experience by retrying failed requests with new tokens and redirecting to login when refresh fails, thereby maintaining secure and continuous access within the applications authentication flow.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- guards Submodule -->
											<details>
												<summary><b>guards</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.auth.guards</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/auth/guards/auth.guard.ts'>auth.guard.ts</a></b></td>
															<td style='padding: 8px;'>- Implements route guarding to ensure only authenticated users access protected areas of the application<br>- It verifies the presence of a valid access token and redirects unauthenticated users to the login page, maintaining secure navigation flow within the overall frontend architecture<br>- This guard plays a critical role in enforcing authentication requirements across the applications routing system.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/auth/guards/redirect-if-auth.guard.ts'>redirect-if-auth.guard.ts</a></b></td>
															<td style='padding: 8px;'>- Enables redirection of authenticated users from the landing page to the dashboard, ensuring a seamless user experience by preventing access to login or public pages when already logged in<br>- Integrates with the applications routing system to automatically navigate users based on their authentication status, supporting efficient flow control within the overall architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/auth/guards/guest.guard.ts'>guest.guard.ts</a></b></td>
															<td style='padding: 8px;'>- Implements a route guard that restricts access to guest-only pages by checking for the presence of an access token<br>- If a token exists, users are redirected to the dashboard, ensuring authenticated users do not access pages meant solely for unauthenticated visitors<br>- This guard maintains proper access control within the applications routing architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.auth.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/auth/services/auth.service.ts'>auth.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides authentication functionalities including login, registration, token refresh, and logout, integrating with backend API endpoints<br>- Manages token storage and retrieval to maintain user sessions, supporting OAuth token handling<br>- Serves as a core service within the applications architecture to facilitate secure user authentication workflows and session management across the frontend.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/auth/services/token.service.ts'>token.service.ts</a></b></td>
															<td style='padding: 8px;'>- Manages authentication tokens within the application, facilitating secure user sessions by storing, retrieving, and validating access and refresh tokens<br>- Ensures seamless user authentication state tracking and token expiration handling, integrating with the overall security architecture to support protected resource access and session persistence across the frontend.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- commit Submodule -->
									<details>
										<summary><b>commit</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.commit</b></code>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.commit.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/commit/services/commit.service.ts'>commit.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides core services for retrieving commit data within the application, enabling seamless access to commit histories, detailed commit information, and diffs<br>- Integrates with backend APIs to support features like browsing repository changes, viewing commit details, and analyzing code modifications, thereby facilitating comprehensive version control insights within the overall architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- collaborator Submodule -->
									<details>
										<summary><b>collaborator</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.collaborator</b></code>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.collaborator.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/collaborator/services/collaborator.service.ts'>collaborator.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides core functionality for managing repository collaborators within the application architecture<br>- Facilitates retrieving, adding, updating, and removing collaborators through API interactions, enabling seamless access control and collaboration management in the platform<br>- Integrates with backend services to ensure consistent and secure collaborator data handling across the project.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- user Submodule -->
									<details>
										<summary><b>user</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.core.user</b></code>
											<!-- services Submodule -->
											<details>
												<summary><b>services</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.core.user.services</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/core/user/services/user.service.ts'>user.service.ts</a></b></td>
															<td style='padding: 8px;'>- Provides user-related functionalities within the frontend architecture, enabling user profile management, search, and account operations<br>- Facilitates interactions with backend APIs for retrieving and updating user data, including profile details, password changes, and public profiles<br>- Serves as a core service to support user-centric features and ensure seamless user account handling across the application.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
							<!-- domain Submodule -->
							<details>
								<summary><b>domain</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-frontend.src.app.domain</b></code>
									<!-- ssh Submodule -->
									<details>
										<summary><b>ssh</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.domain.ssh</b></code>
											<!-- models Submodule -->
											<details>
												<summary><b>models</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.ssh.models</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/ssh/models/ssh-key-info.model.ts'>ssh-key-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for SSH key information within the frontend application, enabling consistent handling and display of SSH key metadata<br>- Facilitates seamless integration between the backend SSH key records and the frontend interface, supporting features such as key management, display of key details, and tracking usage history within the overall project architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/ssh/models/add-ssh-key-form.model.ts'>add-ssh-key-form.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for capturing SSH key details during user input, aligning with backend expectations<br>- Facilitates secure and consistent addition of SSH keys within the frontend application, supporting seamless integration with backend services for managing SSH credentials in the overall architecture<br>- Ensures data integrity and type safety for SSH key management workflows.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- repository Submodule -->
									<details>
										<summary><b>repository</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.domain.repository</b></code>
											<!-- ports Submodule -->
											<details>
												<summary><b>ports</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.repository.ports</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/ports/repo.port.ts'>repo.port.ts</a></b></td>
															<td style='padding: 8px;'>- Defines a contract for interacting with repository data, enabling retrieval and management of repositories, branches, commits, trees, and blobs within the application<br>- Serves as an abstraction layer that decouples data access logic from implementation details, supporting flexible integration with various backend services and maintaining a clean, modular architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- models Submodule -->
											<details>
												<summary><b>models</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.repository.models</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/branch.model.ts'>branch.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for branch data within the project, encapsulating key attributes such as identification, commit details, protection status, and synchronization metrics<br>- Serves as a foundational model for managing and representing branch information across the applications domain, facilitating consistent data handling and integration within the overall repository management system.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/repo-form.model.ts'>repo-form.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structure for repository creation and update operations, aligning with backend DTOs<br>- Facilitates consistent form handling within the frontend, enabling seamless user interactions for managing repository metadata<br>- Integrates into the overall architecture by ensuring data integrity between user inputs and backend processes, supporting efficient repository management workflows.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/repo.model.ts'>repo.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the core data structures representing repository information within the application<br>- It models repository details and owner attributes, facilitating consistent data handling and integration across the frontend architecture<br>- These interfaces enable seamless interaction with repository data, supporting features like display, filtering, and management within the project’s domain layer.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/blob-response.model.ts'>blob-response.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for representing detailed information about binary and text files within the applications domain<br>- Facilitates consistent handling of file metadata, content, and language detection, supporting features such as file browsing, content display, and analysis in the overall architecture of the frontend system<br>- Ensures seamless integration of file data across various components.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/create-branch-form.model.ts'>create-branch-form.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for the payload used to create new branches within the project, aligning with backend data transfer objects<br>- Facilitates consistent data handling and validation when users initiate branch creation, ensuring seamless integration between frontend forms and backend processes in the overall repository management architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/tree-response.model.ts'>tree-response.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines data models representing directory structures and file entries within the project’s backend tree responses<br>- These interfaces facilitate seamless integration between the frontend and backend, enabling accurate rendering and manipulation of repository contents, including directory hierarchies and file metadata, thereby supporting navigation and version control features within the application.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/set-default-branch-form.model.ts'>set-default-branch-form.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structure for setting a default branch within the frontend application, aligning with the backend DTO<br>- Facilitates user input for selecting a branch to be designated as the default, ensuring seamless communication between the user interface and backend services in the project’s repository management workflow.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/commit.model.ts'>commit.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structures representing commit information within the project, encapsulating details about commit authors, statistics, and metadata<br>- These models facilitate consistent handling and display of commit data across the application, supporting features like version history, change tracking, and contributor insights within the overall codebase architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/tree-entry.model.ts'>tree-entry.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structures representing entries within a version control repository tree, including their names, paths, types, and identifiers<br>- These models facilitate consistent handling and manipulation of repository contents across the frontend application, supporting features like browsing, file management, and repository visualization within the overall architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/branch-info.model.ts'>branch-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structure representing branch information within the frontend architecture, aligning with backend API responses<br>- Facilitates consistent handling of branch details such as commit history, protection status, and default designation, enabling seamless integration and display of repository branch data across the application.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/repo-info.model.ts'>repo-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structures representing repository information received from the backend API, encapsulating details about repository ownership, metadata, and status<br>- These models facilitate consistent data handling across the frontend application, enabling seamless integration and display of repository details within the overall project architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/repository/models/blob.model.ts'>blob.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the Blob interface, representing a data object that encapsulates file content, encoding type, and size<br>- It serves as a foundational model within the applications domain, enabling consistent handling and manipulation of binary or textual data across various components of the frontend architecture<br>- This structure facilitates seamless data exchange and processing related to file or content management.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- pull-request Submodule -->
									<details>
										<summary><b>pull-request</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.domain.pull-request</b></code>
											<!-- models Submodule -->
											<details>
												<summary><b>models</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.pull-request.models</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/pull-request/models/pull-request-detail.model.ts'>pull-request-detail.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for detailed pull request data within the frontend application, aligning with backend records<br>- Facilitates consistent handling and display of pull request information, including metadata such as status, author, timestamps, and merge details, thereby supporting features related to code review, collaboration, and project management in the overall architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/pull-request/models/pr-comment-info.model.ts'>pr-comment-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for pull request comment data within the frontend application, aligning with backend records<br>- Facilitates consistent handling and display of comment details such as author, content, associated file, line information, and resolution status, thereby supporting effective review workflows and user interactions in the code review process.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/pull-request/models/pull-request-info.model.ts'>pull-request-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure representing pull request metadata within the frontend application, aligning with backend data<br>- It facilitates consistent handling and display of pull request details such as status, authorship, branches, and timestamps, supporting features related to code review, collaboration, and project management in the overall architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/pull-request/models/pull-request.model.ts'>pull-request.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structures representing pull requests within the project, capturing essential attributes such as status, author, branches, and timestamps<br>- These models facilitate consistent handling, display, and management of pull request information across the application, supporting features like review workflows, status tracking, and user interactions within the codebase architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- auth Submodule -->
									<details>
										<summary><b>auth</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.domain.auth</b></code>
											<!-- ports Submodule -->
											<details>
												<summary><b>ports</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.auth.ports</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/auth/ports/auth.port.ts'>auth.port.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the core interface for authentication operations within the application, facilitating user login, registration, token refresh, and logout processes<br>- Serves as a contract for implementing authentication logic, ensuring consistent interaction with authentication services across the codebase, and supporting secure user session management within the overall architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- models Submodule -->
											<details>
												<summary><b>models</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.auth.models</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/auth/models/login-form.model.ts'>login-form.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for user authentication data, specifically capturing login credentials such as username or email and password<br>- Serves as a foundational model within the authentication flow, ensuring consistent data handling and validation across the frontend application, thereby facilitating secure and reliable user login processes within the overall architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/auth/models/user.model.ts'>user.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the User model within the authentication domain, representing user-related data across the application<br>- It standardizes user information such as identifiers, contact details, display attributes, and administrative status, facilitating consistent handling of user data throughout the frontend architecture<br>- This model supports user management, authentication, and authorization functionalities within the overall project.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/auth/models/register-form.model.ts'>register-form.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for user registration data within the authentication domain, facilitating consistent handling of user input during account creation<br>- Serves as a foundational model that integrates with the broader frontend architecture to ensure reliable data validation and transfer across authentication workflows in the application.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- commit Submodule -->
									<details>
										<summary><b>commit</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.domain.commit</b></code>
											<!-- models Submodule -->
											<details>
												<summary><b>models</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.commit.models</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/commit-info.model.ts'>commit-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for commit-related data within the frontend architecture, encapsulating essential details such as commit identifiers, messages, author information, timestamps, parent commits, and statistics<br>- Serves as a foundational model to standardize how commit information is represented and utilized across the application, supporting features like commit history display and analysis.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/diff-line.model.ts'>diff-line.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for representing individual lines within code diffs, categorizing each line as an addition, deletion, or context<br>- Facilitates accurate rendering and comparison of code changes in the diff viewer, supporting features like line numbering and change tracking within the overall code review and version control architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/paged-result.model.ts'>paged-result.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines a generic structure for paginated data retrieval within the frontend architecture, enabling consistent handling of large datasets across the application<br>- Facilitates efficient navigation through data sets by encapsulating pagination details such as current page, total items, and navigation flags, thereby supporting seamless user experiences in data-driven features.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/diff-hunk.model.ts'>diff-hunk.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for representing a section of code differences, encapsulating metadata such as line ranges, headers, and individual line changes<br>- It facilitates the visualization and processing of code diffs within the applications diff viewer, supporting features like highlighting modifications and navigating changes in the context of the overall code review and version comparison architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/commit-stats.model.ts'>commit-stats.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the CommitStats interface, encapsulating key metrics such as additions, deletions, and files changed within a commit<br>- It standardizes the representation of commit-related data across the frontend application, facilitating consistent data handling and display in the context of version control insights within the overall project architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/file-diff.model.ts'>file-diff.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the data structure representing file differences within commit comparisons, capturing file paths, change types, and detailed hunks<br>- Serves as a core component for visualizing and analyzing code modifications in the project’s diff viewer, supporting features like change tracking, version history, and code review workflows across the frontend architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/commit-detail.model.ts'>commit-detail.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for detailed commit information within the project, encapsulating essential data such as commit identifiers, messages, author details, timestamps, parent commits, statistics, and file changes<br>- Serves as a foundational model for representing comprehensive commit data, enabling consistent handling and display of commit details across the applications frontend architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/commit/models/author-info.model.ts'>author-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the structure for author-related information within the commit domain, encapsulating key details such as name, email, username, and avatar URL<br>- Serves as a foundational data model that standardizes how author metadata is represented and utilized across the frontend application, supporting features like user identification, attribution, and display within the project’s commit history interface.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- collaborator Submodule -->
									<details>
										<summary><b>collaborator</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.domain.collaborator</b></code>
											<!-- models Submodule -->
											<details>
												<summary><b>models</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.domain.collaborator.models</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/domain/collaborator/models/collaborator-info.model.ts'>collaborator-info.model.ts</a></b></td>
															<td style='padding: 8px;'>- Defines the CollaboratorInfo interface, representing user roles and metadata within the project<br>- It facilitates consistent handling of collaborator data across the frontend, aligning with backend records to support permission management and user identification in the applications collaborative features<br>- This structure ensures seamless integration and data integrity within the overall architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
							<!-- features Submodule -->
							<details>
								<summary><b>features</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-frontend.src.app.features</b></code>
									<!-- landing Submodule -->
									<details>
										<summary><b>landing</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.features.landing</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/landing/landing.page.ts'>landing.page.ts</a></b></td>
													<td style='padding: 8px;'>- Defines the landing page component that serves as the entry point for users, facilitating navigation and initial interactions within the application<br>- It integrates routing capabilities and iconography to enhance user experience, forming a foundational element of the frontend architecture that guides users into the app’s core features.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/landing/landing.page.html'>landing.page.html</a></b></td>
													<td style='padding: 8px;'>- Provides the landing page interface for OriginHub, showcasing its core features and value proposition<br>- It introduces users to the platforms capabilities, such as repository hosting, pull requests, and self-hosted control, while guiding new visitors toward registration and documentation<br>- Serves as the primary entry point, emphasizing the projects focus on privacy, control, and comprehensive Git management.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- user-profile Submodule -->
									<details>
										<summary><b>user-profile</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.features.user-profile</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/user-profile/user-profile.page.ts'>user-profile.page.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a user profile view by fetching and displaying a users public information and repositories based on the route parameter<br>- Integrates user and repository services to load data dynamically, supporting navigation within the application<br>- Serves as a key component for user-centric features, enabling seamless access to individual user profiles within the overall architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/user-profile/user-profile.page.html'>user-profile.page.html</a></b></td>
													<td style='padding: 8px;'>- Displays a user profile page showcasing personal details and associated repositories, enabling users to view and navigate their projects seamlessly<br>- Integrates user information with repository summaries, providing a comprehensive overview of a users activity within the platform<br>- Serves as a central interface for user-centric content, enhancing engagement and project exploration.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- user-settings Submodule -->
									<details>
										<summary><b>user-settings</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.features.user-settings</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/user-settings/user-settings.page.html'>user-settings.page.html</a></b></td>
													<td style='padding: 8px;'>- Provides a user interface for managing account settings within the application<br>- Facilitates profile updates, username changes, password security, and SSH key management, integrating various user actions into a cohesive settings page<br>- Supports seamless navigation between different settings tabs and handles account deletion, contributing to the overall user account management architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/user-settings/user-settings.page.ts'>user-settings.page.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a user interface for managing personal account settings, including profile information, security credentials, and SSH keys<br>- Facilitates updating display names, changing passwords, deleting accounts, and handling SSH key lifecycle operations<br>- Integrates with backend services to ensure real-time synchronization and user feedback, supporting a seamless and secure user experience within the overall application architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- dashboard Submodule -->
									<details>
										<summary><b>dashboard</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.features.dashboard</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/dashboard/dashboard.page.ts'>dashboard.page.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a dashboard view of user repositories by fetching and displaying both owned and collaborator repositories, highlighting the users involvement in each<br>- Integrates authentication and repository services to dynamically load relevant data, enabling users to easily manage and navigate their repositories within the application.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/dashboard/dashboard.page.html'>dashboard.page.html</a></b></td>
													<td style='padding: 8px;'>- Displays the users repositories within the dashboard, providing an overview of existing projects and options to create new ones<br>- It manages loading states, handles empty repository lists with prompts to add repositories, and presents repository details such as owner, description, and last update, facilitating easy navigation and project management in the OriginHub frontend.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- docs Submodule -->
									<details>
										<summary><b>docs</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.features.docs</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/docs/docs.page.html'>docs.page.html</a></b></td>
													<td style='padding: 8px;'>- Provides comprehensive user guidance for setting up and interacting with OriginHubs version control system<br>- It details local environment configuration, SSH key management, optional SSH alias setup, and streamlined clone and push commands, facilitating seamless integration and efficient workflow for developers engaging with the platforms repositories.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/docs/docs.page.ts'>docs.page.ts</a></b></td>
													<td style='padding: 8px;'>- Facilitates navigation within the documentation section of the application by enabling smooth scrolling to specific content areas<br>- It integrates routing and icon modules to enhance user experience, supporting seamless movement across documentation topics<br>- This component plays a key role in organizing and accessing documentation content efficiently within the overall frontend architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- repo Submodule -->
									<details>
										<summary><b>repo</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.features.repo</b></code>
											<!-- shared Submodule -->
											<details>
												<summary><b>shared</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.shared</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/shared/repo-breadcrumb.component.ts'>repo-breadcrumb.component.ts</a></b></td>
															<td style='padding: 8px;'>- Provides navigational breadcrumbs for repository views, enabling users to easily understand their current location within a projects directory structure<br>- It dynamically generates links based on repository owner, name, branch, and path, facilitating seamless navigation across different levels of the repository hierarchy within the frontend architecture.</td>
														</tr>
													</table>
													<!-- utils Submodule -->
													<details>
														<summary><b>utils</b></summary>
														<blockquote>
															<div class='directory-path' style='padding: 8px 0; color: #666;'>
																<code><b>⦿ originhub-frontend.src.app.features.repo.shared.utils</b></code>
															<table style='width: 100%; border-collapse: collapse;'>
															<thead>
																<tr style='background-color: #f8f9fa;'>
																	<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
																	<th style='text-align: left; padding: 8px;'>Summary</th>
																</tr>
															</thead>
																<tr style='border-bottom: 1px solid #eee;'>
																	<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/shared/utils/encoding.ts'>encoding.ts</a></b></td>
																	<td style='padding: 8px;'>- Facilitates decoding of Base64-encoded strings into UTF-8 text, enabling seamless data transformation within the frontend applications shared utilities<br>- Supports the overall architecture by ensuring consistent and reliable decoding processes, which are essential for handling encoded data received from APIs or other external sources, thereby enhancing data integrity and user experience across the project.</td>
																</tr>
															</table>
														</blockquote>
													</details>
												</blockquote>
											</details>
											<!-- layout Submodule -->
											<details>
												<summary><b>layout</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.layout</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/layout/repo-layout.component.ts'>repo-layout.component.ts</a></b></td>
															<td style='padding: 8px;'>- Provides the main layout and data management for repository pages within the application<br>- It orchestrates fetching repository details and open pull requests based on route parameters, updating shared state and UI indicators accordingly<br>- This component ensures seamless integration of repository information and pull request data, serving as a central hub for repository-related views in the overall architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/layout/repo-layout.component.html'>repo-layout.component.html</a></b></td>
															<td style='padding: 8px;'>- Provides the main layout and navigation structure for repository pages within the frontend application<br>- It displays repository details, such as owner, name, description, and topics, and offers tabbed navigation for code, branches, commits, pull requests, and settings<br>- This component orchestrates the visual organization and routing of repository-related views, ensuring a cohesive user experience across repository features.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- settings Submodule -->
											<details>
												<summary><b>settings</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.settings</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/settings/repo-settings.page.ts'>repo-settings.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a comprehensive interface for managing repository settings, including updating metadata, handling collaborators, and deleting repositories<br>- Integrates with backend services to ensure real-time synchronization and user feedback, supporting seamless administrative control within the larger project architecture focused on collaborative code management and version control.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/settings/repo-settings.page.html'>repo-settings.page.html</a></b></td>
															<td style='padding: 8px;'>- Provides a user interface for managing repository settings, including general information, collaborator access, and safety options<br>- Facilitates editing repository details, adding or removing collaborators with specific permissions, and performing critical actions like deletion within a structured tabbed layout<br>- Integrates key functionalities for repository administration, ensuring streamlined control over project configurations and team collaboration.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- pull-requests Submodule -->
											<details>
												<summary><b>pull-requests</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.pull-requests</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/pull-requests/pr-detail.page.ts'>pr-detail.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a comprehensive interface for viewing and managing pull request details, including comments, file diffs, and commit history<br>- Facilitates user interactions such as commenting, editing, merging, and closing pull requests, while dynamically loading relevant data based on user actions and current context within the repository<br>- Ensures seamless collaboration and decision-making workflows for pull request review processes.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/pull-requests/pr-detail.page.html'>pr-detail.page.html</a></b></td>
															<td style='padding: 8px;'>- This code file defines the user interface for viewing detailed information about a specific pull request within the application<br>- It facilitates navigation back to the list of pull requests, displays the current status of the pull request, and provides actions such as closing the pull request when appropriate<br>- Overall, it serves as the primary presentation layer for pull request details, integrating seamlessly into the larger architecture to enable users to review, manage, and interact with individual pull requests efficiently.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/pull-requests/new-pull-request.page.ts'>new-pull-request.page.ts</a></b></td>
															<td style='padding: 8px;'>- Facilitates the creation of new pull requests within the repository by managing user input, loading branch data, and handling submission workflows<br>- Integrates with backend services to generate pull requests, providing a seamless interface for initiating code reviews and collaboration, thereby supporting the overall repository management and development process.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/pull-requests/pull-requests.page.html'>pull-requests.page.html</a></b></td>
															<td style='padding: 8px;'>- Provides an interactive interface for managing pull requests within a repository, enabling users to view, filter, and create pull requests based on their status (open, merged, closed)<br>- It enhances project collaboration by streamlining pull request navigation, status tracking, and facilitating new pull request creation, thereby integrating seamlessly into the overall repository management workflow.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/pull-requests/new-pull-request.page.html'>new-pull-request.page.html</a></b></td>
															<td style='padding: 8px;'>- Facilitates the creation of new pull requests by providing a user interface for entering essential details such as title, description, source and target branches, and draft status<br>- Integrates with the overall repository management system to streamline proposing changes between branches, enhancing collaboration and code review workflows within the project architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/pull-requests/pull-requests.page.ts'>pull-requests.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides an interface for viewing and filtering pull requests within a specific repository, supporting open, closed, and merged states<br>- Integrates with backend services to fetch relevant pull request data dynamically based on route parameters, and offers real-time counts and status-based visual cues to enhance user navigation and understanding of pull request statuses within the project architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- commits Submodule -->
											<details>
												<summary><b>commits</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.commits</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/commits/commit-detail.page.ts'>commit-detail.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a detailed view of individual commit information within the repository, including commit metadata, file changes, and diffs<br>- Facilitates user interaction for expanding file differences and interpreting change types, thereby enabling comprehensive exploration of commit history and modifications in the project’s architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/commits/commit-detail.page.html'>commit-detail.page.html</a></b></td>
															<td style='padding: 8px;'>- Displays detailed information about a specific commit within the repository, including author details, commit message, parent commits, and file changes<br>- Facilitates user understanding of commit history and modifications, supporting navigation through commit lineage and visualizing code diffs<br>- Integrates seamlessly into the overall architecture to enhance repository insights and version tracking.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/commits/commits.page.html'>commits.page.html</a></b></td>
															<td style='padding: 8px;'>- Displays a paginated list of commit entries for a specific repository branch, enabling users to browse commit history with details such as messages, authors, timestamps, and change stats<br>- Facilitates branch selection and handles loading states and errors, integrating seamlessly into the repository overview to support version tracking and code review workflows.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/commits/commits.page.ts'>commits.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a dedicated interface for viewing and navigating commit history within a repository<br>- Facilitates fetching, displaying, and paginating commits and branches, while managing user interactions such as branch selection and page navigation<br>- Integrates seamlessly into the overall architecture by connecting to core services and maintaining reactive state, enabling users to explore repository changes efficiently.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- create Submodule -->
											<details>
												<summary><b>create</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.create</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/create/create-repo.page.html'>create-repo.page.html</a></b></td>
															<td style='padding: 8px;'>- Facilitates user interface for creating new repositories within the platform, enabling users to input repository details such as name, description, default branch, and topics<br>- Integrates form validation and user feedback mechanisms to ensure accurate data entry, supporting seamless repository setup as part of the overall project architecture focused on repository management and collaboration.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/create/create-repo.page.ts'>create-repo.page.ts</a></b></td>
															<td style='padding: 8px;'>- Facilitates user-driven creation of new repositories within the platform by providing a form interface for inputting repository details, validating data, and handling submission<br>- Integrates with backend services to persist repository data, manages user feedback through notifications, and navigates to the newly created repository’s page, supporting seamless onboarding and project setup workflows.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- home Submodule -->
											<details>
												<summary><b>home</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.home</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/home/repo-home.page.ts'>repo-home.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides the main interface for browsing a repositorys file structure, branches, and README content within the frontend<br>- Manages data fetching, branch selection, and rendering of directory trees and README files, enabling users to navigate repositories seamlessly<br>- Integrates with backend services to dynamically load repository data and supports user interactions like copying clone URLs and switching branches.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/home/repo-home.page.html'>repo-home.page.html</a></b></td>
															<td style='padding: 8px;'>- Provides the user interface for browsing, managing, and cloning repositories within the project<br>- Facilitates repository exploration through branch selection, directory navigation, and display of README content<br>- Supports repository setup and cloning actions via intuitive dialogs, enabling seamless interaction with repository data and streamlining the onboarding and development workflow.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- blob Submodule -->
											<details>
												<summary><b>blob</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.blob</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/blob/blob.page.html'>blob.page.html</a></b></td>
															<td style='padding: 8px;'>- Displays detailed information and content preview of individual files within the repository<br>- Facilitates navigation through file hierarchy, shows file size and line count, and renders code with syntax highlighting or indicates binary files<br>- Enhances user experience by enabling content copying and providing visual cues during loading, supporting efficient code browsing and exploration within the repositorys architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/blob/blob.page.ts'>blob.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a detailed view of individual repository files by fetching, displaying, and syntax-highlighting file content based on URL parameters<br>- Facilitates navigation through repository structure with breadcrumb support, enables content copying, and dynamically updates content on route changes, integrating seamlessly into the overall architecture to enhance user interaction with repository data.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- tree Submodule -->
											<details>
												<summary><b>tree</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.tree</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/tree/tree.page.html'>tree.page.html</a></b></td>
															<td style='padding: 8px;'>- Displays a navigable view of repository contents, including folders and files, with associated metadata such as last commit messages and sizes<br>- Facilitates user exploration of project structure within the web interface, enabling seamless browsing of repository hierarchy and quick access to individual items<br>- Integrates breadcrumb navigation for contextual awareness and enhances user experience in repository management.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/tree/tree.page.ts'>tree.page.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a dynamic interface for browsing repository directory structures by fetching and displaying tree entries based on URL parameters<br>- Facilitates navigation through repository branches and paths, generating breadcrumb navigation and route links for files and subdirectories<br>- Integrates with backend APIs to load directory contents, supporting seamless exploration within the overall repository browsing architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- branches Submodule -->
											<details>
												<summary><b>branches</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.repo.branches</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/branches/branches.page.html'>branches.page.html</a></b></td>
															<td style='padding: 8px;'>- Provides a user interface for managing repository branches, enabling creation, deletion, and setting default branches<br>- Facilitates interaction with branch data, displays branch details, and handles user actions through modals, supporting seamless branch management within the overall repository architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/repo/branches/branches.page.ts'>branches.page.ts</a></b></td>
															<td style='padding: 8px;'>- Manages branch operations within the repository feature, including listing, creating, setting default, and deleting branches<br>- Facilitates user interactions through modals and notifications, ensuring seamless branch management aligned with the repository context<br>- Integrates with backend services to perform actions and updates the UI accordingly, supporting efficient repository maintenance workflows.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
									<!-- auth Submodule -->
									<details>
										<summary><b>auth</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.features.auth</b></code>
											<!-- login Submodule -->
											<details>
												<summary><b>login</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.auth.login</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/auth/login/login.page.ts'>login.page.ts</a></b></td>
															<td style='padding: 8px;'>- Facilitates user authentication by managing login workflows, including form validation, OAuth token handling, and navigation to the dashboard upon success<br>- Integrates multiple login methods such as username/password, Google, and GitHub, while providing real-time feedback through notifications<br>- Serves as a critical entry point within the frontend architecture, ensuring secure and seamless user access to the application.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/auth/login/login.page.html'>login.page.html</a></b></td>
															<td style='padding: 8px;'>- Provides the user interface for the login process within the application, enabling users to authenticate via email/password or third-party providers like GitHub and Google<br>- Facilitates user sign-in, displays validation errors, and offers navigation to registration, forming a core component of the authentication flow in the overall architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- register Submodule -->
											<details>
												<summary><b>register</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.features.auth.register</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/auth/register/register.page.ts'>register.page.ts</a></b></td>
															<td style='padding: 8px;'>- Facilitates user registration within the authentication feature by providing a form for input validation, handling account creation through the authentication service, and managing user feedback via notifications<br>- Supports multiple registration methods, including email/password and OAuth providers like Google and GitHub, contributing to the overall user onboarding and access management architecture.</td>
														</tr>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/features/auth/register/register.page.html'>register.page.html</a></b></td>
															<td style='padding: 8px;'>- Facilitates user registration by providing a responsive, user-friendly interface for account creation, including input validation and social login options<br>- Integrates seamlessly into the overall authentication flow, enabling new users to sign up via email or third-party providers like GitHub and Google, thereby supporting onboarding and user management within the applications architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
							<!-- layout Submodule -->
							<details>
								<summary><b>layout</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-frontend.src.app.layout</b></code>
									<!-- footer Submodule -->
									<details>
										<summary><b>footer</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.layout.footer</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/layout/footer/footer.component.html'>footer.component.html</a></b></td>
													<td style='padding: 8px;'>- Provides a footer component that delivers consistent branding and essential navigation elements across the OriginHub frontend application<br>- It displays the project logo, name, and a link to documentation, while also including copyright information<br>- This component ensures a cohesive user experience by maintaining a unified footer layout throughout the site.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/layout/footer/footer.component.ts'>footer.component.ts</a></b></td>
													<td style='padding: 8px;'>- Provides the footer section of the applications user interface, displaying consistent bottom-of-page content across different views<br>- It dynamically shows the current year, ensuring the footer remains up-to-date, and facilitates navigation through embedded router links<br>- This component contributes to the overall layout and user experience by maintaining a cohesive and accessible footer across the frontend architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- navbar Submodule -->
									<details>
										<summary><b>navbar</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.layout.navbar</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/layout/navbar/navbar.component.ts'>navbar.component.ts</a></b></td>
													<td style='padding: 8px;'>- Provides the navigation bar component for the applications frontend, managing user authentication status, displaying user information and avatar, and controlling menu interactions<br>- It integrates authentication and user services to dynamically load and update user data, ensuring a responsive and personalized navigation experience within the overall application architecture.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/layout/navbar/navbar.component.html'>navbar.component.html</a></b></td>
													<td style='padding: 8px;'>- Provides the navigational header for the application, enabling seamless access to core sections such as Dashboard, Docs, Settings, and user profile management<br>- It dynamically adjusts based on authentication status, offering login, registration, and user-specific options, thereby ensuring consistent and intuitive navigation across the entire project architecture.</td>
												</tr>
											</table>
										</blockquote>
									</details>
								</blockquote>
							</details>
							<!-- shared Submodule -->
							<details>
								<summary><b>shared</b></summary>
								<blockquote>
									<div class='directory-path' style='padding: 8px 0; color: #666;'>
										<code><b>⦿ originhub-frontend.src.app.shared</b></code>
									<!-- pipes Submodule -->
									<details>
										<summary><b>pipes</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.shared.pipes</b></code>
											<table style='width: 100%; border-collapse: collapse;'>
											<thead>
												<tr style='background-color: #f8f9fa;'>
													<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
													<th style='text-align: left; padding: 8px;'>Summary</th>
												</tr>
											</thead>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/shared/pipes/file-size.pipe.ts'>file-size.pipe.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a reusable data transformation component that formats raw file size values into human-readable strings within the applications user interface<br>- It enhances the overall architecture by standardizing how file sizes are displayed across various components, ensuring consistency and improving user experience when interacting with file-related data.</td>
												</tr>
												<tr style='border-bottom: 1px solid #eee;'>
													<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/shared/pipes/relative-time.pipe.ts'>relative-time.pipe.ts</a></b></td>
													<td style='padding: 8px;'>- Provides a reusable Angular pipe that formats dates into human-readable relative time strings, such as 3 hours ago<br>- Integrates with the overall frontend architecture to enhance user experience by displaying dynamic, context-aware time information across the application<br>- Supports consistent, localized time representations, contributing to intuitive and engaging UI interactions.</td>
												</tr>
											</table>
										</blockquote>
									</details>
									<!-- components Submodule -->
									<details>
										<summary><b>components</b></summary>
										<blockquote>
											<div class='directory-path' style='padding: 8px 0; color: #666;'>
												<code><b>⦿ originhub-frontend.src.app.shared.components</b></code>
											<!-- avatar Submodule -->
											<details>
												<summary><b>avatar</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.shared.components.avatar</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/shared/components/avatar/avatar.component.ts'>avatar.component.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a reusable avatar component that dynamically displays user profile images via Gravatar or fallback initials, supporting multiple sizes and customization options<br>- Integrates seamlessly into the applications UI, ensuring consistent avatar presentation across the platform while abstracting avatar rendering logic for ease of use and maintainability within the overall frontend architecture.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- toast Submodule -->
											<details>
												<summary><b>toast</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.shared.components.toast</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/shared/components/toast/toast.component.ts'>toast.component.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a reusable toast notification component for user feedback within the application<br>- It displays success or error messages with corresponding icons and styles, allowing users to acknowledge or dismiss notifications<br>- Integrates seamlessly into the overall UI architecture, enhancing user experience through consistent, accessible, and visually distinct alerts.</td>
														</tr>
													</table>
												</blockquote>
											</details>
											<!-- confirm-modal Submodule -->
											<details>
												<summary><b>confirm-modal</b></summary>
												<blockquote>
													<div class='directory-path' style='padding: 8px 0; color: #666;'>
														<code><b>⦿ originhub-frontend.src.app.shared.components.confirm-modal</b></code>
													<table style='width: 100%; border-collapse: collapse;'>
													<thead>
														<tr style='background-color: #f8f9fa;'>
															<th style='width: 30%; text-align: left; padding: 8px;'>File Name</th>
															<th style='text-align: left; padding: 8px;'>Summary</th>
														</tr>
													</thead>
														<tr style='border-bottom: 1px solid #eee;'>
															<td style='padding: 8px;'><b><a href='https://github.com/nuricanozturk01/originhub/blob/master/originhub-frontend/src/app/shared/components/confirm-modal/confirm-modal.component.ts'>confirm-modal.component.ts</a></b></td>
															<td style='padding: 8px;'>- Provides a reusable confirmation modal component for user interactions within the application<br>- Facilitates consistent prompts for actions requiring user approval or cancellation, supporting customizable titles, messages, button labels, and visual variants<br>- Integrates seamlessly into the overall frontend architecture, enhancing user experience by standardizing modal dialogs across various features.</td>
														</tr>
													</table>
												</blockquote>
											</details>
										</blockquote>
									</details>
								</blockquote>
							</details>
						</blockquote>
					</details>
				</blockquote>
			</details>
		</blockquote>
	</details>
</details>

---

## 🚀 Getting Started

### 📋 Prerequisites

This project requires the following dependencies:

- **Programming Language:** Java
- **Package Manager:** Maven, Npm
- **Container Runtime:** Docker

### ⚙️ Installation

Build originhub from the source and install dependencies:

1. **Clone the repository:**

    ```sh
    ❯ git clone https://github.com/nuricanozturk01/originhub
    ```

2. **Navigate to the project directory:**

    ```sh
    ❯ cd originhub
    ```

3. **Install the dependencies:**

**Using [docker](https://www.docker.com/):**

```sh
❯ docker build -t nuricanozturk01/originhub .
```
**Using [maven](https://maven.apache.org/):**

```sh
❯ mvn install
```
**Using [npm](https://www.npmjs.com/):**

```sh
❯ npm install
```

### 💻 Usage

Run the project with:

**Using [docker](https://www.docker.com/):**

```sh
docker run -it {image_name}
```
**Using [maven](https://maven.apache.org/):**

```sh
mvn exec:java
```
**Using [npm](https://www.npmjs.com/):**

```sh
npm start
```

### 🧪 Testing

Originhub uses the {__test_framework__} test framework. Run the test suite with:

**Using [docker](https://www.docker.com/):**

```sh
echo 'INSERT-TEST-COMMAND-HERE'
```
**Using [maven](https://maven.apache.org/):**

```sh
mvn test
```
**Using [npm](https://www.npmjs.com/):**

```sh
npm test
```

---

## 📈 Roadmap

- [X] **`Task 1`**: <strike>Implement feature one.</strike>
- [ ] **`Task 2`**: Implement feature two.
- [ ] **`Task 3`**: Implement feature three.

---

## 🤝 Contributing

- **💬 [Join the Discussions](https://github.com/nuricanozturk01/originhub/discussions)**: Share your insights, provide feedback, or ask questions.
- **🐛 [Report Issues](https://github.com/nuricanozturk01/originhub/issues)**: Submit bugs found or log feature requests for the `originhub` project.
- **💡 [Submit Pull Requests](https://github.com/nuricanozturk01/originhub/blob/main/CONTRIBUTING.md)**: Review open PRs, and submit your own PRs.

<details closed>
<summary>Contributing Guidelines</summary>

1. **Fork the Repository**: Start by forking the project repository to your github account.
2. **Clone Locally**: Clone the forked repository to your local machine using a git client.
   ```sh
   git clone https://github.com/nuricanozturk01/originhub
   ```
3. **Create a New Branch**: Always work on a new branch, giving it a descriptive name.
   ```sh
   git checkout -b new-feature-x
   ```
4. **Make Your Changes**: Develop and test your changes locally.
5. **Commit Your Changes**: Commit with a clear message describing your updates.
   ```sh
   git commit -m 'Implemented new feature x.'
   ```
6. **Push to github**: Push the changes to your forked repository.
   ```sh
   git push origin new-feature-x
   ```
7. **Submit a Pull Request**: Create a PR against the original project repository. Clearly describe the changes and their motivations.
8. **Review**: Once your PR is reviewed and approved, it will be merged into the main branch. Congratulations on your contribution!
</details>

<details closed>
<summary>Contributor Graph</summary>
<br>
<p align="left">
   <a href="https://github.com{/nuricanozturk01/originhub/}graphs/contributors">
      <img src="https://contrib.rocks/image?repo=nuricanozturk01/originhub">
   </a>
</p>
</details>

---

## 📜 License

Originhub is protected under the [LICENSE](https://choosealicense.com/licenses) License. For more details, refer to the [LICENSE](https://choosealicense.com/licenses/) file.

---

## ✨ Acknowledgments

- Credit `contributors`, `inspiration`, `references`, etc.

<div align="left"><a href="#top">⬆ Return</a></div>

---
