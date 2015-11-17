{{template "_head.gtpl"}}
  <div class="timeline">
    {{ if .}}
    <div class="modal-content">
      <div class="modal-header">
        <h4 class="modal-title" id="newNoteLabel"><span class="glyphicon glyphicon-pencil"></span>  Edit Task</h4>
      </div>
      <div class="modal-body">
        <form action="/update/" method="POST">
          <div class="form-group">
            <input type="text" name="title" value="{{.Title}}" class="form-control" id="add-note-title" placeholder="Title" style="border:none;border-bottom:1px solid gray; box-shadow:none;">
          </div>
          <div class="form-group">
            <!--
						<textarea class="form-control" name="content" value="{{.Title}}" id="add-note-content" placeholder="Content" rows="10" style="border:none;border-bottom:1px solid gray; box-shadow:none;"></textarea>
-->
            <input type="text" name="content" value="{{.Content}}" class="form-control" id="add-note-title" placeholder="Title" style="border:none;border-bottom:1px solid gray; box-shadow:none;">

            <input type="text" name="id" value="{{.Id}}" class="hidden" />
          </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <input type="submit" text="submit" class="btn btn-default" />
      </div>
      </form>
    </div>
    {{else}}
    <p>No tasks here</p>
    {{end}}
  </div>
  {{template "_footer.gtpl"}}

</body>

</html>
