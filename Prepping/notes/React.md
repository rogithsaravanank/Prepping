### React

- React uses two DOMs: the Real DOM and the Virtual DOM.

- The Virtual DOM re-renders.

- `ReactDOM.render(<App />, document.getElementById('root'));`

```javascript
function App() {
    // logic, methods

    return (
        <>
            {/* JSX */}
        </>
    );
}
```

- `useState()` is used to fetch and store values during rendering or state changes.

- Props are used to send values from one component to another (parent to child, one-way data flow).
