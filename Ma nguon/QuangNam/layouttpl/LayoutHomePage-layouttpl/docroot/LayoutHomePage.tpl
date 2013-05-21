<div class="LayoutHomePage" id="main-content" role="main">
	<div class="portlet-layout">
		<div class="portlet-column aui-w75"  style="padding:0px 0px 0px 10px;">
			<div class="portlet-layout">
				<div class="portlet-column portlet-column-first aui-w100">
					$processor.processColumn("column-1", "portlet-column-content portlet-column-content-first")
				</div>
			</div>
			<div class="portlet-layout">
				<div class="portlet-column portlet-column-first aui-w33">
					$processor.processColumn("column-2", "portlet-column-content portlet-column-content-first")
				</div>
				<div class="portlet-column aui-w33">
					$processor.processColumn("column-3", "portlet-column-content")
				</div>
				<div class="portlet-column aui-w33">
					$processor.processColumn("column-4", "portlet-column-content")
				</div>
			</div>
			<div class="portlet-layout">
				<div class="portlet-column aui-100">
					$processor.processColumn("column-5", "portlet-column-content")
				</div>
			</div>
		</div>
		<div class="portlet-column portlet-column-last aui-w24" style="padding:0px 10px 0px 5px;">
			$processor.processColumn("column-6", "portlet-column-content portlet-column-content-last")
		</div>
	</div>
</div>
