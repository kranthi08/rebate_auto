WinWaitActive("Open","","10")
If WinExists("Open") Then
ControlFocus("Open","","Edit1")
Sleep(1000)
ControlSetText("Open","","Edit1",$CmdLine[1])
Sleep(1000)
ControlClick("Open","","Button1")
EndIf