@echo off
echo Compilando Main.java...
javac src\Main.java -d out
if %ERRORLEVEL% EQU 0 (
    echo Compilacao bem-sucedida!
    echo.
    echo Executando Main...
    echo Digite algo quando solicitado:
    java -cp out Main
) else (
    echo Erro na compilacao!
)
pause
