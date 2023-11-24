function showLoader() {
    document.documentElement.style.overflow = 'hidden';
    document.body.scroll = "yes";
    document.getElementById('cover_screen').style.display = "block";
    document.getElementById('cover_screen').style.position = "fixed";
    document.getElementById('loader_image').style.display = "block";
}

function hideLoader() {
    document.getElementById('cover_screen').style.display = "none";
    document.getElementById('loader_image').style.display = "none";
    document.documentElement.style.overflow = 'auto';
    document.body.scroll = "no";
}

