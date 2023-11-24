function notifySuccess(message) {

	new PNotify({

		title: message,

		icon: 'icon-checkmark3',

		type: 'success',

		opacity: 0.90,

		timeout: '100',

		cornerclass: "no-border-radius",

		addclass: 'pnotify-center',

		styling: 'bootstrap3',

		closer: true,

		labels: { close: "Fechar", stick: "Manter" }

	});

}



function notifyWarning(message) {

	new PNotify({

		title: message,

		icon: 'icon-warning22',

		type: 'notic',

		opacity: 0.90,

		timeout: '100',

		cornerclass: "no-border-radius",

		addclass: 'pnotify-center',

		styling: 'bootstrap3',

		closer: true,

		labels: { close: "Fechar", stick: "Manter" }

	});

}



function notifyInfo(message) {

	new PNotify({

		title: message,

		icon: 'icon-warning22',

		type: 'info',

		opacity: 0.90,

		timeout: '100',

		cornerclass: "no-border-radius",

		addclass: 'pnotify-center',

		styling: 'bootstrap3',

		closer: true,

		labels: { close: "Fechar", stick: "Manter" }

	});

}



function notifyError(message, text) {

	new PNotify({

		title: message,

		icon: 'icon-blocked',

		type: 'error',

		opacity: 0.90,

		timeout: '100',

		cornerclass: "no-border-radius",

		addclass: 'pnotify-center',

		styling: 'bootstrap3',

		closer: true,

		labels: { close: "Fechar", stick: "Manter" }

	});

}

