const stripe = Stripe('pk_test_51Pds9QLsV6HQjbYRjYG1jnS08pTV6O1qJ7ttKM3ndo71glp5rdz4rLYBjsTz5WPgstv91KiqdWpGuBnd7g2qOxh400z5E1O3Gq');
const paymentButton = document.querySelector('#paymentButton');

paymentButton.addEventListener('click', () => {
	stripe.redirectToCheckout({
		sessionId: sessionId
	})
});