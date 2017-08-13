package edu.ucsc.cross.hse.model.position.euclidean;

import edu.ucsc.cross.hse.core.framework.component.Component;
import edu.ucsc.cross.hse.core.framework.data.Data;

public class EuclideanPositionData extends Component implements EuclideanPosition
{

	Data<Double> xPosition; // x position
	Data<Double> yPosition; // y position
	Data<Double> zPosition; // z position

	/*
	 * Constructor with position defined
	 */
	public EuclideanPositionData(Double x_position, Double y_position, Double z_position)
	{
		super("Euclidean Position");
		instantiateElements(x_position, y_position, z_position);
	}

	/*
	 * Constructor without position defined
	 */
	public EuclideanPositionData()
	{
		super("Euclidean Position");
		instantiateElements(0.0, 0.0, 0.0);
	}

	/*
	 * Instantiates the data elements
	 */
	private void instantiateElements(Double x_position, Double y_position, Double z_position)
	{
		xPosition = new Data<Double>("X Position", x_position);
		yPosition = new Data<Double>("Y Position", y_position);
		zPosition = new Data<Double>("Z Position", z_position);
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