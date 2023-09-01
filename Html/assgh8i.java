<!DOCTYPE html>
<!-- saved from url=(0054)http://127.0.0.1:5500/other/Document_files/assg8e.html -->
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <header>
        <div style="background-color: rgb(250, 194, 214); padding-top: 2%; padding-bottom: 2%; padding-left: 2%;">
            My Website heading 
        </div>
        <nav style="background-color: rgb(210, 201, 189); display: inline-block; padding-bottom: 27%; padding-right:15% ;">
           <div>Main manu</div> 
            <div>Html</div>
            <div>Css</div>
            <div>JavaScript</div>
        </nav>
        <main>
            <div style="margin: top -50%;; margin-left: 15%">Technical and manaerial tutorial</div>
        </main>
        <footer style="color: aliceblue; margin-top:43.5% ; text-align: center; background-color: green; padding-top: 3%;padding-bottom: 3%; ">
            <div>c Copright 2007, all Righ Reserved.</div>
        </footer>
    </header>
<!-- Code injected by live-server -->
<script>
	// <![CDATA[  <-- For SVG support
	if ('WebSocket' in window) {
		(function () {
			function refreshCSS() {
				var sheets = [].slice.call(document.getElementsByTagName("link"));
				var head = document.getElementsByTagName("head")[0];
				for (var i = 0; i < sheets.length; ++i) {
					var elem = sheets[i];
					var parent = elem.parentElement || head;
					parent.removeChild(elem);
					var rel = elem.rel;
					if (elem.href && typeof rel != "string" || rel.length == 0 || rel.toLowerCase() == "stylesheet") {
						var url = elem.href.replace(/(&|\?)_cacheOverride=\d+/, '');
						elem.href = url + (url.indexOf('?') >= 0 ? '&' : '?') + '_cacheOverride=' + (new Date().valueOf());
					}
					parent.appendChild(elem);
				}
			}
			var protocol = window.location.protocol === 'http:' ? 'ws://' : 'wss://';
			var address = protocol + window.location.host + window.location.pathname + '/ws';
			var socket = new WebSocket(address);
			socket.onmessage = function (msg) {
				if (msg.data == 'reload') window.location.reload();
				else if (msg.data == 'refreshcss') refreshCSS();
			};
			if (sessionStorage && !sessionStorage.getItem('IsThisFirstTime_Log_From_LiveServer')) {
				console.log('Live reload enabled.');
				sessionStorage.setItem('IsThisFirstTime_Log_From_LiveServer', true);
			}
		})();
	}
	else {
		console.error('Upgrade your browser. This Browser is NOT supported WebSocket for Live-Reloading.');
	}
	// ]]>
</script>

</body></html>