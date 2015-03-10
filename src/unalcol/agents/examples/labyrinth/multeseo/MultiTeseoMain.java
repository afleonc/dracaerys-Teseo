/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unalcol.agents.examples.labyrinth.multeseo;

import dracaerys.teseo.MyTeseo;
import unalcol.agents.Agent;
import unalcol.agents.AgentProgram;
import unalcol.agents.examples.labyrinth.Labyrinth;
import unalcol.agents.examples.labyrinth.LabyrinthDrawer;
import unalcol.agents.examples.labyrinth.teseo.simple.RandomReflexTeseo;
import unalcol.agents.simulate.util.SimpleLanguage;
import unalcol.types.collection.vector.Vector;


public class MultiTeseoMain {
  private static SimpleLanguage getLanguage(){
    return  new SimpleLanguage( new String[]{"front", "right", "back", "left", "exit",
        "afront", "aright", "aback", "aleft"},
                                   new String[]{"no_op", "die", "advance", "rotate"}
                                   );
  }

  public static void main( String[] argv ){
     AgentProgram[] teseo = new AgentProgram[12];
    
    //Se crean los diferentes agentes
    teseo[0] = new MyTeseo();
    ((MyTeseo) teseo[0]).setLanguage(getLanguage());
   /* teseo[1] = new MyTeseo();
    ((MyTeseo) teseo[1]).setLanguage(getLanguage());
    teseo[2] = new MyTeseo();
    ((MyTeseo) teseo[2]).setLanguage(getLanguage());
    teseo[3] = new MyTeseo();
    ((MyTeseo) teseo[3]).setLanguage(getLanguage());
    teseo[4] = new MyTeseo();
    ((MyTeseo) teseo[4]).setLanguage(getLanguage());
    teseo[5] = new MyTeseo();
    ((MyTeseo) teseo[5]).setLanguage(getLanguage());
    teseo[6] = new RandomReflexTeseo();
    ((RandomReflexTeseo) teseo[6]).setLanguage(getLanguage());
    teseo[7] = new RandomReflexTeseo();
    ((RandomReflexTeseo) teseo[7]).setLanguage(getLanguage());
    teseo[8] = new RandomReflexTeseo();
    ((RandomReflexTeseo) teseo[8]).setLanguage(getLanguage());
    teseo[9] = new RandomReflexTeseo();
    ((RandomReflexTeseo) teseo[9]).setLanguage(getLanguage());
    teseo[10] = new RandomReflexTeseo();
    ((RandomReflexTeseo) teseo[10]).setLanguage(getLanguage());*/
    /*teseo[1] = new RandomReflexTeseo();
    ((RandomReflexTeseo) teseo[1]).setLanguage(getLanguage());*/
     
    LabyrinthDrawer.DRAW_AREA_SIZE = 600;
    LabyrinthDrawer.CELL_SIZE = 40;
    Labyrinth.DEFAULT_SIZE = 15;
    
    Agent agent0 = new Agent(teseo[0]);
    //Agent agent1 = new Agent(teseo[1]);
    /*Agent agent2 = new Agent(teseo[2]);
    Agent agent3 = new Agent(teseo[3]);
    Agent agent4 = new Agent(teseo[4]);
    Agent agent5 = new Agent(teseo[5]);
    Agent agent6 = new Agent(teseo[6]);
    Agent agent7 = new Agent(teseo[7]);
    Agent agent8 = new Agent(teseo[8]);
    Agent agent9 = new Agent(teseo[9]);
    Agent agent10 = new Agent(teseo[10]);
    Agent agent11 = new Agent(teseo[11]);*/

    Vector<Agent> agent = new Vector();
    
    agent.add(agent0);
    //agent.add(agent1);
    /*agent.add(agent2);
    agent.add(agent3);
    agent.add(agent4);
    agent.add(agent5);
    agent.add(agent6);
    agent.add(agent7);
    agent.add(agent8);
    agent.add(agent9);
    agent.add(agent10);
    agent.add(agent11);*/
    
    MultiAgentLabyrinthMainFrame frame = new MultiAgentLabyrinthMainFrame( agent, getLanguage() );
    frame.setVisible(true); 
  }
}
