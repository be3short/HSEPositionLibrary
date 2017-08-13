package edu.ucsc.cross.hse.model.position.euclidean;

import edu.ucsc.cross.hse.core.framework.component.Component;
import edu.ucsc.cross.hse.core.framework.data.State;

public class Euclidean3DState extends Component implements EuclideanPositionState, EuclideanPosition
{

	public State xPosition; // x position state
	public State yPosition; // y position state
	public State zPosition; // z position state

	/*
	 * Constructor with position defined
	 */
	public Euclidean3DState(Double x_position, Double y_position, Double z_position)
	{
		instantiateElements(x_position, y_position, z_position);
	}

	/*
	 * Constructor without position defined
	 */
	public Euclidean3DState()
	{
		instantiateElements(0.0, 0.0, 0.0);
	}

	/*
	 * Instantiates the state elements
	 */
	private void instantiateElements(Double x_position, Double y_position, Double z_position)
	{
		xPosition = new State("X Position", x_position);
		yPosition = new State("Y Position", y_position);
		zPosition = new State("Z Position", z_position);
	}

	/*
	 * Get the the x state component
	 */
	@Override
	public State getXPositionState()
	{
		return xPosition;
	}

	/*
	 * Get the the y state component
	 */
	@Override
	public State getYPositionState()
	{

		return yPosition;
	}

	/*
	 * Get the the z state component
	 */
	@Override
	public State getZPositionState()
	{
		// TODO Auto-generated method stub
		return zPosition;
	}

	/*
	 * Get the value of the x state component
	 */

	@Override
	public Double getXPosition()
	{
		// TODO Auto-generated method stub
		return xPosition.getValue();
	}

	/*
	 * Get the value of the y state component
	 */

	@Override
	public Double getYPosition()
	{
		// TODO Auto-generated method stub
		return yPosition.getValue();
	}

	/*
	 * Get the value of the z state component
	 */

	@Override
	public Double getZPosition()
	{
		// TODO Auto-generated method stub
		return zPosition.getValue();
	}

}
