// ===============================
// XYZ Bank - Diwali Coupon Project
// ===============================

// Scenario 1
// Welcome popup on mouse hover

function trigger() {

    document
        .getElementById("hover")
        .addEventListener("mouseover", popup);

}

function popup() {

    alert("Welcome to XYZ Bank !!!");

}

// ===============================
// Scenario 2
// Hide Instructions
// ===============================

function hideInstructions() {

    document.getElementById("demo").style.display = "none";

}

// ===============================
// Scenario 3
// Validate Customer
// ===============================

function validateCustomer() {

    let custId = document
        .getElementById("custID")
        .value
        .trim();

    let result = document.getElementById("result");

    if (custId === "") {

        result.innerHTML =
            "<p class='error'>❌ Customer ID can't be blank.</p>";

        return;
    }

    if (custId.includes("XYZ")) {

        result.innerHTML =
            "<p class='success'>✅ Customer ID is valid. You can proceed to generate the coupon.</p>";

    }

    else {

        result.innerHTML =
            "<p class='error'>❌ You are not a valid customer.</p>";

    }

}

// ===============================
// Scenario 4
// Generate Coupon
// ===============================

function generateCoupon() {

    let custId = document
        .getElementById("custID")
        .value
        .trim();

    let result = document.getElementById("result");

    if (custId === "") {

        result.innerHTML =
            "<p class='error'>❌ Customer ID can't be blank.</p>";

        return;
    }

    if (custId.includes("XYZ")) {

        let coupon = custId + "789456";

        result.innerHTML = `
            <p class="success">
                🎉 Coupon Generated Successfully!
            </p>

            <br>

            <h3>
                Coupon Code
            </h3>

            <h2 style="color:#1d4ed8;">
                ${coupon}
            </h2>
        `;

    }

    else {

        result.innerHTML =
            "<p class='error'>❌ Invalid Customer ID. Coupon can't be generated.</p>";

    }

}
