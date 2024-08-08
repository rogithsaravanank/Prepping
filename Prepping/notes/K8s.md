## Kubernetes

### Container
- Every applicaations are now being packaged into docker images.
- Docker images are easy way to handle a packaged application
- Container will contain the docker images

### Orchestration Tech
- K8s, Docker swarm ,mesos

### Kubernetes Architecture
- Nodes or minion - wokrer machine
- Clusters - multiple nodes form this
- Master - orchestration of the service of nodes and clusters

### Services of K8s
- API server : frontend for k8s runs in k8s master node
- etcd : key value store , locks 
- kubelet : agent to check containers are up
- Container runtime : run container (dokcer)
- Controller : brain of orchestrations
- Scheduler : ditributing the load

### Commands 
- kubectl run hello-minikube
- kubectl cluster-info
- kubectl get nodes