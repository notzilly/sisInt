package cbr;

import jcolibri.cbraplications.StandardCBRApplication;
import jcolibri.cbrcore.CBRCase;
import jcolibri.cbrcore.CBRCaseBase;
import jcolibri.cbrcore.CBRQuery;
import jcolibri.cbrcore.Connector;
import jcolibri.exception.ExecutionException;
import jcolibri.exception.InitializingException;
import jcolibri.method.retrieve.NNretrieval.NNConfig;

import javax.annotation.Generated;
import representation.DescCaso;
import jcolibri.method.retrieve.NNretrieval.NNConfig;
import jcolibri.cbrcore.Attribute;

public class CBRApplication implements StandardCBRApplication {

	@Generated(value = { "ColibriStudio" })
	Connector connector;
	
	@Generated(value = { "ColibriStudio" })
	CBRCaseBase casebase;



	//******************************************************************/
	// Configuration
	//******************************************************************/

	@Override
	public void configure() throws ExecutionException {
		try{
			configureConnector();
			configureCaseBase();
		} catch (Exception e){
			throw new ExecutionException(e);
		}
	}

	/** Configures the connector */
	@Generated(value = { "CS-PTConector" })	
	private void configureConnector() throws InitializingException{
		connector = new jcolibri.connector.PlainTextConnector();
		connector.initFromXMLfile(jcolibri.util.FileIO
				.findFile("config/plainTextConnectorConfig.xml"));
	}

	/** Configures the case base */
	@Generated(value = { "CS-CaseManager" })	
	private void configureCaseBase() throws InitializingException{
		casebase = new jcolibri.casebase.LinearCaseBase();
	}

	//******************************************************************/
	// Similarity
	//******************************************************************/
	
	/** Configures the similarity */
	@Generated(value = { "CS-Similarity" })	
	private NNConfig getSimilarityConfig() {
		NNConfig simConfig = new NNConfig();
		simConfig
				.setDescriptionSimFunction(new jcolibri.method.retrieve.NNretrieval.similarity.global.Average());
		Attribute attribute0 = new Attribute("CaseId", DescCaso.class);
		simConfig
				.addMapping(
						attribute0,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute0, 0.00);
		Attribute attribute1 = new Attribute("Player1Pontos", DescCaso.class);
		simConfig
				.addMapping(
						attribute1,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute1, 1.00);
		Attribute attribute2 = new Attribute("Player2Pontos", DescCaso.class);
		simConfig
				.addMapping(
						attribute2,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute2, 1.00);
		Attribute attribute3 = new Attribute("Carta1", DescCaso.class);
		simConfig
				.addMapping(
						attribute3,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute3, 0.45);
		Attribute attribute4 = new Attribute("Carta2", DescCaso.class);
		simConfig
				.addMapping(
						attribute4,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute4, 0.65);
		Attribute attribute5 = new Attribute("Carta3", DescCaso.class);
		simConfig
				.addMapping(
						attribute5,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute5, 1.00);
		Attribute attribute6 = new Attribute("RodadaAtual", DescCaso.class);
		simConfig
				.addMapping(
						attribute6,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute6, 1.00);
		Attribute attribute7 = new Attribute("RodadasGanhas", DescCaso.class);
		simConfig
				.addMapping(
						attribute7,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Threshold());
		simConfig.setWeight(attribute7, 1.00);
		Attribute attribute8 = new Attribute("AceitouTruco", DescCaso.class);
		simConfig
				.addMapping(
						attribute8,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute8, 1.00);
		Attribute attribute9 = new Attribute("PediuRetruco", DescCaso.class);
		simConfig
				.addMapping(
						attribute9,
						new jcolibri.method.retrieve.NNretrieval.similarity.local.Equal());
		simConfig.setWeight(attribute9, 1.00);
		return simConfig;
	}

	//******************************************************************/
	// Methods
	//******************************************************************/
	

	@Generated(value = { "ColibriStudio" })
	@Override
	public CBRCaseBase preCycle() throws ExecutionException {
		casebase.init(connector);
		return casebase;
	}
		
	@Generated(value = { "ColibriStudio" })	
	@Override
	public void cycle(CBRQuery query) throws ExecutionException {
	}

	@Generated(value = { "ColibriStudio" })
	@Override
	public void postCycle() throws ExecutionException {
		connector.close();
	}

	/**
	 * Main method
	 */
	@Generated(value = { "ColibriStudio" })
	public static void main(String[] args) {
		CBRApplication cbrApp = new CBRApplication();
		try {
			cbrApp.configure();
			cbrApp.preCycle();
			
			CBRQuery query = new CBRQuery();
			query.setDescription(new DescCaso());
			jcolibri.method.gui.formFilling.ObtainQueryWithFormMethod.obtainQueryWithoutInitialValues(query, null, null);
			cbrApp.cycle(query);
			cbrApp.postCycle();
			
//			for(CBRCase c: caseBase.getCases())
//				System.out.println(c);
			
		} catch (ExecutionException e) {
			e.printStackTrace();
		}

	}
}
