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
- kubectl get pods -o wide
- kubectl run nginx --image=nginx : creating a ngnix pods
- kubectl create deployment nginx --image=nginx : Creating a deployment

### YAML
- Key - value pair --> Fruit: Apple
- Array/Lists --> Multiple items are of same type of the object, These are ordered
Fruits:
-   Orage
-   Pineapple
- Dictionary --> these are unordered
Banana:
    Calories: 105
    Fat: 0.5

### Sample
Employee://Dictionary
  Name: Jacob
  Sex: Male
  Age: 30
  Title: Systems Engineer
  Projects://List
    - Automation
    - Support
  Payslips:// List of Dictionaries
    - Month: June
      Wage: 4000
    - Month: July
      Wage: 4500
    - Month: August
      Wage: 4000

### Yaml in k8s:
```
apiVersion: v1
kind: Pod
metadata: 
  name: myapp-pod
  labels:
      app: myapp
      type: frontend
spec:
  containers:
  - name : ngnix-controller
    image: ngnix ```

To create the pod

```kubectl apply -f pod.yaml```

```kubectl describe podname```

