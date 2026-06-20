// auth.js — include on every protected page
(function() {
    const publicPages = ['login.html'];
    const currentPage = window.location.pathname.split('/').pop();

    if (publicPages.includes(currentPage)) return;

    const userId = localStorage.getItem('userId');
    const role   = localStorage.getItem('userRole');

    if (!userId) {
        window.location.href = 'login.html';
        return;
    }

    // Role-based page protection
    // Foster pages should not be accessible to pet owners and vice versa
    const fosterOnlyPages   = ['foster.html'];
    const ownerOnlyPages    = ['dashboard.html', 'dashboard.html'];

    if (fosterOnlyPages.includes(currentPage) && role !== 'foster') {
        window.location.href = 'dashboard.html';
    }
    if (ownerOnlyPages.includes(currentPage) && role !== 'pet_owner') {
        window.location.href = 'foster.html';
    }
})();