import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.security.Signature;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.Timer;

public class LifeModel implements ActionListener
{

	/*
	 *  This is the Model component.
	 */

	private static int SIZE = 60;
	private LifeCell[][] grid;
	
	LifeView myView;
	Timer timer;
	boolean bRandomColor = false;

	/** Construct a new model using a particular file */
	public LifeModel(LifeView view, String fileName) throws IOException
	{       
		int r, c;
		grid = new LifeCell[SIZE][SIZE];

		for ( r = 0; r < SIZE; r++ )
			for ( c = 0; c < SIZE; c++ )
				grid[r][c] = new LifeCell();

		if ( fileName == null ) //use random population
		{                                           
			for ( r = 0; r < SIZE; r++ )
			{
				for ( c = 0; c < SIZE; c++ )
				{
					if ( Math.random() > 0.85) //15% chance of a cell starting alive
						grid[r][c].setAliveNow(true);
				}
			}
		}
		else
		{                 
			Scanner input = new Scanner(new File(fileName));
			int numInitialCells = input.nextInt();
			for (int count=0; count<numInitialCells; count++)
			{
				r = input.nextInt();
				c = input.nextInt();
				grid[r][c].setAliveNow(true);
			}
			input.close();
		}


		myView = view;
		myView.updateView(grid);

	}

	/** Constructor a randomized model */
	public LifeModel(LifeView view) throws IOException
	{
		this(view,null);
	}

	/** pause the simulation (the pause button in the GUI */
	public void pause()
	{
		timer.stop();
	}
	
	/** resume the simulation (the pause button in the GUI */
	public void resume()
	{
		timer.restart();
	}
	
	/** run the simulation (the pause button in the GUI */
	public void run()
	{
		timer = new Timer(50, this);
		timer.setCoalesce(true);
		timer.start();
	}


	public void reset()
	{
		if(timer != null)
			timer.stop();
		int r, c;
		grid = new LifeCell[SIZE][SIZE];

		for ( r = 0; r < SIZE; r++ )
			for ( c = 0; c < SIZE; c++ )
				grid[r][c] = new LifeCell();

		for ( r = 0; r < SIZE; r++ )
		{
			for ( c = 0; c < SIZE; c++ )
			{
				if ( Math.random() > 0.85) //15% chance of a cell starting alive
					grid[r][c].setAliveNow(true);
			}
		}

		myView.updateView(grid);
	}

	/** called each time timer fires */
	public void actionPerformed(ActionEvent e)
	{
		oneGeneration();
		myView.updateView(grid);
	}

	/** main logic method for updating the state of the grid / simulation */
	private void oneGeneration()
	{
		for( int r = 0; r < SIZE; r++)
		{
			for (int c = 0; c < SIZE; c++)
			{
				int neighbors = neighborCount(r, c);

				if(grid[r][c].isAliveNow())
					grid[r][c].setAliveNext(neighbors >= 2 && neighbors <= 3);
				else
					grid[r][c].setAliveNext(neighbors == 3);
			}
		}

		for( int r = 0; r < SIZE; r++)
			for (int c = 0; c < SIZE; c++)
			{
				grid[r][c].setAliveNow(grid[r][c].isAliveNext());
				grid[r][c].setAliveNext(false);
			}

	}

	private int neighborCount (int r, int c)
	{
		int count = 0;
		for( int i = r-1; i <= r+1; i++)
		{
			for( int j = c-1; j <= c+1; j++)
			{
				if (i >= 0 && i < SIZE && j >= 0 && j < SIZE )
					if (!(i == r && j == c))
						if (grid[i][j].isAliveNow())
							count++;
			}
		}
		return count;
	}

}

