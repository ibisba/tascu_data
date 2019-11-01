package eu.ibisba;

import fi.vtt.tascu.ontology.domain.Service;
import fi.vtt.tascu.ontology.domain.Step;
import nl.wur.ssb.RDFSimpleCon.api.Domain;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Creating memory store
        Domain domain = new Domain("");

        CommandOptions commandOptions = new CommandOptions(args);
        System.err.println(commandOptions.tascu.getAbsolutePath());
        Scanner scanner = new Scanner(commandOptions.tascu);
        // Skipping header
        scanner.nextLine();
        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("\t");
            if(line.length != 13) {
                System.err.println(StringUtils.join(line, "\t"));
                throw new Exception("Line length is incomplete");
            }
            // Break down of the line...
            int id = Integer.parseInt(line[0]);
            // Making the step
            Step step = domain.make(Step.class, "https://tascu.vtt.fi/data/" + id);
            step.setId(id);

            // Setting the name
            String step_name = line[3].replace("*","").replaceAll("^ +","");
            step.setName(step_name);

            // Setting the parent identifier
            int parent_id = Integer.parseInt(line[1]);
            if (parent_id != 0) {
                Step parentStep = domain.make(Step.class, "https://tascu.vtt.fi/data/" + parent_id);
                step.setParent(parentStep);
            }

            int position = Integer.parseInt(line[2]);

            // Setting the description
            if (line[4].length() != 0) {
                step.setDescription(line[4]);
            }

            // Organism?
            String organism = line[5];

            // SOP address
            if (!line[6].matches("NULL") && line[6].length() > 0) {
                step.setProtocol(line[6]);
            }

            // Set duration
            if (!line[7].matches("NULL") && line[7].length() > 0) {
                step.setDuration(Double.parseDouble(line[7]));
            }

            // Part of what kind of service?
            if (!line[8].matches("NULL") && line[8].length() > 0) {
                Service service = domain.make(Service.class, "https://tascu.vtt.fi/data/");
                String part_of_service = line[8];
                System.err.println("PART_OF_SERVICE: " + part_of_service);
                step.setService(service);
            }

            // Setting additional comments
            if (line[9].length() != 0) {
                step.setComment(line[9].replaceAll("\"",""));
            }

            if (!line[10].matches("NULL")) {
                step.setSuccessRate(Double.parseDouble(line[10]));
            }

            // TODO
            String created = line[11];
            String last_modified = line[12];
        }
        domain.save(commandOptions.tascu + ".ttl");
    }
}
