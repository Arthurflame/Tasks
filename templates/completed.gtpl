{{template "_head.gtpl"}}

  <div class="timeline">
    {{ if .}} {{range .}}
    <div class="note">
      <p class="noteHeading">{{.Title}}</p>
      <hr>
      <p class="noteContent">{{.Content}}</p>
      <span class="notefooter">
                    <ul class="menu">
                     <!-- <li role="presentation">
                          <a role="menuitem" tabindex="-1" href="/share/{{.Id}}">
                          <span class="glyphicon glyphicon-share"></span> Share</a>
      </li>
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="/mask/{{.Id}}">
          <span class="glyphicon glyphicon-lock"></span> Mask</a>
      </li>
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="/archive/{{.Id}}">
          <span class="glyphicon glyphicon-inbox"></span> Edit</a>
      </li>!-->
      <li role="presentation">
        <a role="menuitem" tabindex="-1" href="/trash/{{.Id}}">
          <span class="glyphicon glyphicon-trash"></span> Trash</a>
      </li>
      <!-- <li role="presentation"><a role="menuitem" tabindex="-1" href="/restore/{{.Id}}">
                           <span class="glyphicon glyphicon-inbox"></span>  Restore</a></li> -->
      </ul>
      </span>
    </div>
    {{end}} {{else}}
    <p>No tasks here</p>
    {{end}}
  </div>
	{{template "_footer.gtpl"}}

</body>

</html>
