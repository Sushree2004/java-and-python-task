
# 🐳 Docker & Kubernetes - Assessment Project

This repository contains a mini-project demonstrating containerization using **Docker** and orchestration using **Kubernetes**. It is designed for learning and showcasing DevOps practices in a practical and organized manner.

---

## 📸 Project Screenshots

### ✅ Docker Build and Run

![Docker Run creating image & container]

### 🚢 Kubernetes Deployment

![K8s Deployment]
![K8s Services]
![K8s Pods]
![K8s UI]

---

## 📦 Project Overview

The project includes:

- A **Dockerized** application
- A `Dockerfile` to build the image
- Kubernetes manifests to deploy the app on a cluster
- Basic configurations for services, deployments, and pods

## 📁 Folder Structure

```
Docker&Kubernetes/
├── Dockerfile                 # Docker build instructions
├── app/                       # Source code of the app
│   └── (your application files)
├── k8s/
│   ├── deployment.yaml        # Deployment manifest
│   ├── service.yaml           # Service manifest
│   └── other-k8s-files.yaml   # Any additional K8s resources
└── README.md                  # You're reading it!
```

### 2. Build Docker Image

```bash
docker build -t image-docket.
```

### 3. Run Locally (Optional)

```bash
docker run -p 8080:8080 image-docker
```

### 4. Deploy to Kubernetes

Make sure `kubectl` is configured and pointing to your cluster:

```bash
kubectl apply -f k8s/
```

Verify the deployment:

```bash
kubectl get all
```

## ⚙️ Prerequisites

- Docker
- Kubernetes (Minikube, Kind, or Cloud K8s cluster)
- kubectl CLI
- (Optional) DockerHub account for image pushing

## 📚 Learning Objectives

- Understand Dockerfile creation
- Build and run a containerized app
- Create and apply Kubernetes manifests
- Deploy applications on Kubernetes clusters

---
