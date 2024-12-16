<h1 align="center">CRUD API - Product registration</h1>
<p>This is the first project I built using Java Spring Boot. It's a RESTFUL API with the purpose to manage products registration, including CRUD operations.</p>
<div class="technologies">
    <h4>Technologies used:</h4>
    <ul>
        <li><strong>Java Spring Boot:</strong> Framework used to build the API.</li>
        <li><strong>PostgreSQL:</strong> Relation database used to store products information.</li>
        <li><strong>Postman:</strong> Tool used to test HTTP requests (GET, POST, PUT,
            DELETE).</li>
    </ul>
</div>
<div class="api-routes">
    <h4>API Routes:</h4>
    <p>The main routes implemented for the API are:</p>
    <ul>
        <li><code>GET /products</code>: Returns the list of all the registered products.</li>
        <li><code>GET /products/{id}</code>: Returns the details for a specific product.</li>
        <li><code>POST /products</code>: Registers a new product.</li>
        <li><code>PUT /products/{id}</code>: Updates the information of an existent product.</li>
        <li><code>DELETE /products/{id}</code>: Deletes a product from the database.</li>
    </ul>
    <p>Each route was tested and validated using Postman, with requests in JSON format.</p>
</div>
