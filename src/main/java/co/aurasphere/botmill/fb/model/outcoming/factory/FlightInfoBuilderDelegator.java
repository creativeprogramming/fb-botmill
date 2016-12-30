package co.aurasphere.botmill.fb.model.outcoming.factory;

import co.aurasphere.botmill.fb.model.outcoming.template.airline.FlightInfo;


/**
 * An interface that represents a builder which uses a {@link FlightInfoBuilder}
 * object to populate its {@link FlightInfo} field.
 * 
 * @author Donato Rimenti
 * 
 */
public abstract class FlightInfoBuilderDelegator extends AirlineBaseTemplateBuilder {

	/**
	 * Adds a flight info object to the builder's payload.
	 * 
	 * @param flightInfo
	 *            the flight info to add.
	 */
	abstract void addFlightInfo(FlightInfo flightInfo);
	
}
