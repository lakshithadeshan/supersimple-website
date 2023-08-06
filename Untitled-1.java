// Simple animation: fading the "View Portfolio" button on page load
document.addEventListener("DOMContentLoaded", function () {
  const ctaButton = document.querySelector(".cta-btn");
  ctaButton.style.opacity = 0;
  let opacity = 0;

  const fadeIn = setInterval(function () {
    opacity += 0.02;
    ctaButton.style.opacity = opacity;
    if (opacity >= 1) {
      clearInterval(fadeIn);
    }
  }, 20);
});
