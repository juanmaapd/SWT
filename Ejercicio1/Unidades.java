package Ejercicio1;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class Unidades {

	protected Shell shell;
	private Text text;
	private Text text_1;
	private Text text_2;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Unidades window = new Unidades();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(508,400);
		shell.setText("App");
		
		Button btnCalcular = new Button(shell, SWT.NONE);
		
		btnCalcular.setBounds(205, 162, 75, 25);
		btnCalcular.setText("CALCULAR");
		
		Label lblUnidades = new Label(shell, SWT.NONE);
		lblUnidades.setBounds(105, 40, 55, 15);
		lblUnidades.setText("UNIDADES");
		
		Label lblPrecio = new Label(shell, SWT.NONE);
		lblPrecio.setBounds(105, 98, 40, 15);
		lblPrecio.setText("PRECIO");
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(304, 37, 76, 21);
		
		text_1 = new Text(shell, SWT.BORDER);
		text_1.setBounds(304, 95, 76, 21);
		
		text_2 = new Text(shell, SWT.BORDER);
		text_2.setBounds(137, 218, 222, 70);

		
		btnCalcular.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				int unidades = Integer.parseInt(text.getText());
				float precio = Float.parseFloat(text_1.getText());
				text_2.setText(String.valueOf(unidades*precio));
			}
		});
	}
}
