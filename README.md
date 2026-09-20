# E2E Encrypted Chat Server

A backend messaging service built around genuine end-to-end encryption — the server routes and stores messages but never has access to plaintext content. Encryption and decryption happen client-side; the server is architected so that even with full database access, message content remains unreadable.

## Overview

This project is a from-scratch implementation of the core mechanics behind Signal/WhatsApp-style messaging: user management, conversations, message delivery, and — as the central technical focus — end-to-end encryption with proper key exchange, rather than a wrapper around an existing encryption library.

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| Framework | Spring Boot |
| Database | PostgreSQL (H2 for local development) |
| Auth | JWT (access + refresh tokens) |
| Build | Maven |

## Architecture & Roadmap

**Phase 1 — Core Entities & CRUD**
User, Conversation, and Message entities with basic REST endpoints for account creation and message exchange.

**Phase 2 — Persistent Storage**
Migration from in-memory H2 to PostgreSQL, with schema versioning via Flyway.

**Phase 3 — Authentication & Encryption Core**
JWT-based authentication, and the project's central feature: client-side key exchange and message encryption, with the server storing ciphertext exclusively.

**Planned extensions:** group messaging with per-member key management, offline message delivery, disappearing messages, encrypted media sharing, multi-device support, and real-time presence via WebSockets.

## Getting Started

```bash
./mvnw spring-boot:run
```

The application runs on `localhost:8080`. Local development uses an in-memory H2 database by default; PostgreSQL configuration will be added in Phase 2.

## Project Status

Actively in development. Phase 1 is underway — this README will be expanded with API documentation, setup instructions, and architecture diagrams as the project matures.
